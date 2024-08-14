package module;

import com.google.gson.Gson;
import payload.pojo.Auth;
import payload.pojo.Booking;
import payload.pojo.Bookingdates;

public class PayloadModule {

    public String createauth()
    {
        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");
        Gson gson1 = new Gson();
        String payload1 = gson1.toJson(auth);
        return  payload1;

    }

   public String createmodule()
    {

        Booking booking = new Booking();
        booking.setFirstname("Ishita");
        booking.setLastname("baxi");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2018-01-05");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
       Gson gson = new Gson();
       String payload = gson.toJson(booking);
       return  payload;

    }
    public String PutModule()
    {
        Booking booking1 = new Booking();
        booking1.setFirstname("Ishita");
        booking1.setLastname("baxi");
        booking1.setTotalprice(111);
        booking1.setDepositpaid(true);


        Bookingdates bookingdates1 = new Bookingdates();
        bookingdates1.setCheckin("2018-01-01");
        bookingdates1.setCheckout("2018-01-05");
        booking1.setBookingdates(bookingdates1);
        booking1.setAdditionalneeds("Breakfast");

        Gson gson = new Gson();
        String payload1 = gson.toJson(booking1);
        return  payload1;

    }
}
