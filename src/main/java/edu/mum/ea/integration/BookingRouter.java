package edu.mum.ea.integration;

import edu.mum.ea.domain.WrapUser;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

/**
 * Created by darith on 7/19/17.
 */

@MessageEndpoint
public class BookingRouter {

    @Router(inputChannel="processBooking")
    public String processBooking(WrapUser wrapUser) {

        return "toJmsBooking";
    }
}
