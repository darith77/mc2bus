package edu.mum.ea.integration;

import edu.mum.ea.domain.User;
import edu.mum.ea.domain.WrapUser;


/**
 * Created by darith on 7/19/17.
 */
public interface BookingTransformer {

    public WrapUser transformBooking(User user);
}
