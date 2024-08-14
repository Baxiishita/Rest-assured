package tests.crud;

import endpoint.APIConstants;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class Featchbooking extends BaseTest {

    @Test
    public void getMethod() {
        rspec = new RequestSpecBuilder().setBaseUri(APIConstants.Base_URL)
                .setBasePath(APIConstants.get_base_path)
                .addHeader("Content-type", "application/json").build().log().all();

        ValidatableResponse response1 = RestAssured.given().spec(rspec)
                .when().get().then().log().all();
        response1.statusCode(200);
    }
}
