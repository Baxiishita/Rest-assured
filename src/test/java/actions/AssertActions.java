package actions;


import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssertActions {

    //premade test function



    public void verifyResponseBody(String actual, String expected, String description)
    {
        assertEquals(actual,expected,description);
    }
    public void verifyResponseBody(float actual, float expected, String description)
    {
        assertEquals(actual,expected,description);
    }
    public void verifyResponseBody(int actual, int expected, String description)
    {
        assertEquals(actual,expected,description);
    }
    public  void verifyResponseBody(double actual, double expected, String description)
    {
        assertEquals(actual,expected,description);
    }
    public void verifyResonseBody(boolean actual, boolean expected, String description)

    {
        assertEquals(actual,expected,description);
    }
}
