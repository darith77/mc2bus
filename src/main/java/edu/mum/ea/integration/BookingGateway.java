package edu.mum.ea.integration;

import edu.mum.ea.domain.WrapUser;
import org.springframework.integration.annotation.Gateway;

/**
 * Created by darith on 7/19/17.
 */
public interface BookingGateway {

    @Gateway(requestChannel="processBooking")
    public void process(WrapUser wrapUser);
}
