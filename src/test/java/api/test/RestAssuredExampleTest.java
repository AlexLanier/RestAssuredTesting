package api.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test; // ✅ JUnit 5 import

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredExampleTest {

    static {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetPosts() {
        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("size()", greaterThan(0));
    }
}
