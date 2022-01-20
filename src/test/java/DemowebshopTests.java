import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class DemowebshopTests {

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "http://demowebshop.tricentis.com";
    }

    @Test
    void addToCartWithCookiesTest() {
        String data = "addtocart_31.EnteredQuantity=1";

        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .cookie("Nop.customer=4641da7c-7926-4fdf-b5fa-6a3b82d83c89")
                .body(data)
                .when()
                .post("/addproducttocart/details/31/1")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                // body("updatetopcartsectionhtml": "(???)")
                .extract().response();

        System.out.println(response.asString());
    }

    @Test
    void addToNewUserCartTest() {
        String data = "addtocart_31.EnteredQuantity=1";

        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
//                .cookie("Nop.customer=4641da7c-7926-4fdf-b5fa-6a3b82d83c89")
                .body(data)
                .when()
                .post("/addproducttocart/details/31/1")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                .body("updatetopcartsectionhtml", is("(1)"))
                .extract().response();

        System.out.println(response);
    }
}
