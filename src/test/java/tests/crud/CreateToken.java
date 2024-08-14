package tests.crud;

import endpoint.APIConstants;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import module.PayloadModule;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CreateToken extends BaseTest {
    PayloadModule payload = new PayloadModule();

    @Test
    public void createToken() {

        rspec = new RequestSpecBuilder().setBaseUri(APIConstants.Base_URL).setBasePath(APIConstants.get_token)
                .addHeader("Content-type", "application/json").build().log().all();
        PayloadModule payload = new PayloadModule();
        ValidatableResponse response = RestAssured.given().spec(rspec)
                .when().body(payload.createauth())
                .post().then().log().all();
        response.body("token.length()",Matchers.is(15));

    }
}
