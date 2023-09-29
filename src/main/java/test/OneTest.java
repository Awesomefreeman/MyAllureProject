import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OneTest {
    @Test
    void test_01() {
        given()
                .filter(new AllureRestAssured())
                .relaxedHTTPSValidation()
                .when()
                .log().all()
                .get("https://www.google.com")
                .then()
                .log().all()
                .statusCode(200);
    }
}
