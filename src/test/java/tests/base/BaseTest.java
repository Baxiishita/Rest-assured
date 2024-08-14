package tests.base;

import endpoint.APIConstants;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import module.PayloadModule;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    public RequestSpecification rspec;

    @BeforeMethod
    void setUpconfig() {
        rspec = new RequestSpecBuilder().setBaseUri(APIConstants.Base_URL)
                .addHeader("Content-type", "application/json").build().log().all();
    }


}

