import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HWDemowebshopTests {

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
    void OneWishTest() {

        final String LOGIN = "test_demowebshop_91@gmail.ru";
        final String PASSWORD = "test1234";

        step("login and adding item to wishlist by API", () -> {

            Map<String, String> authorizationCookies =
                    given()
                            .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                            .formParam("Email", LOGIN)
                            .formParam("Password", PASSWORD)
                            .when()
                            .post("/login")
                            .then()
                            .statusCode(302)
                            .extract()
                            .cookies();

            given()
                    .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                    .cookies(authorizationCookies)
                    .body("addtocart_43.EnteredQuantity=1")
                    .when()
                    .post("/addproducttocart/details/43/2")
                    .then()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("updatetopwishlistsectionhtml", is(equalTo("(1)")));

            String authorizationCookie = authorizationCookies.get("NOPCOMMERCE.AUTH");

            step("open logo", () ->
                    open("/Themes/DefaultClean/Content/images/logo.png"));

            step("adding cookies", () ->
                    getWebDriver().manage().addCookie(new Cookie("NOPCOMMERCE.AUTH", authorizationCookie)));
        });

        step("Go to wishlist", () ->
                open("/wishlist"));

        step("Setting value of wishes", () ->
                $(".qty-input").setValue("0"));

        step("Update wishlist", () ->
                $(".button-2.update-wishlist-button").click());

        step("And finally", () ->
                $(".wishlist-qty").shouldHave(text("(0)")));

    }
}
