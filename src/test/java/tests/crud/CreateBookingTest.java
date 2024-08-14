package tests.crud;

import endpoint.APIConstants;
import groovy.xml.StreamingDOMBuilder;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import module.PayloadModule;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CreateBookingTest extends BaseTest {
     PayloadModule payload;


    @Test
    public void testCreateBook() {
        rspec = new RequestSpecBuilder().setBaseUri(APIConstants.Base_URL)
                .addHeader("Content-type", "application/json").build().log().all();
        rspec.basePath(APIConstants.Base_Path);
        PayloadModule payloadModule = new PayloadModule();
        ValidatableResponse response = RestAssured.given().spec(rspec)
                .when().body(payloadModule.createmodule())
                .post().then().log().all();
                response.statusCode(200);
        response.body("bookingid", Matchers.notNullValue());

    }


}
