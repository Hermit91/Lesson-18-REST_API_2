import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class HWDemowebshopTests extends WishlistResponse {

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "http://demowebshop.tricentis.com";
        Configuration.baseUrl = "http://demowebshop.tricentis.com";
    }

    @Test
    @Tag("API")
    void addToNewUserCartTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("addtocart_31.EnteredQuantity=1")
                .when()
                .post("/addproducttocart/details/31/1")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                .body("updatetopcartsectionhtml", is("(1)"));
    }

    @Test
    @Tag("API")
    void addToNewUserWishlistTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("addtocart_43.EnteredQuantity=1")
                .when()
                .post("/addproducttocart/details/43/2")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("updatetopwishlistsectionhtml", is("(1)"))
                .body("message", is("The product has been added to your " +
                        "\u003ca href=\"/wishlist\"\u003ewishlist\u003c/a\u003e"));
    }

    @Test
    @Tag("API+UI")
    void addToWishlistWithCookiesTest() {

        String login = "test_demowebshop_91@gmail.ru";
        String password = "test1234";

        step("Get cookie and set it to browser by API", () -> {
            String authorizationCookie =
                    given()
                            .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                            .formParam("Email", login)
                            .formParam("Password", password)
                            .when()
                            .post("login")
                            .then()
                            .statusCode(302)
                            .extract()
                            .cookie("NOPCOMMERCE.AUTH");

            step("Open site (logo)", () ->
                    open("/Themes/DefaultClean/Content/images/logo.png"));

            step("Adding cookie to browser", () ->
                    getWebDriver().manage().addCookie(
                            new Cookie("NOPCOMMERCE.AUTH", authorizationCookie)));
        });

        step("Open smartphone page", () ->
                open("/smartphone"));

        step("Check user's wishlist", () ->
                $(".wishlist-qty").shouldHave(text("(0)")));

        step("Add smartphone to wishlist", () ->
                $("#add-to-wishlist-button-43").click());

        step("Check user's wishlist again", () ->
                $(".wishlist-qty").shouldHave(text("(1)")));

        step("Go to wishlist", () ->
                $(".wishlist-qty").click());

        step("Setting value of wishes", () ->
                $(".qty-input").setValue("0"));

        step("Update wishlist", () ->
                $(".button-2.update-wishlist-button").click());

        step("And finally", () ->
                $(".wishlist-qty").shouldHave(text("(0)")));
    }
}

