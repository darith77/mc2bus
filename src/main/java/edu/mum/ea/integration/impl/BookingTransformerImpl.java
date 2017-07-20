package edu.mum.ea.integration.impl;

import edu.mum.ea.domain.User;
import edu.mum.ea.domain.WrapUser;
import edu.mum.ea.integration.BookingTransformer;
import org.springframework.integration.annotation.Transformer;

/**
 * Created by darith on 7/19/17.
 */
public class BookingTransformerImpl implements BookingTransformer {


    @Transformer(inputChannel="fromAmqpBooking", outputChannel="toJmsBooking")
    public WrapUser transformBooking(User user) {
        WrapUser wrapUser = new WrapUser();
        wrapUser.setUser(user);


        System.out.println("User: " + user.getFirstName() + " " + user.getLastName());

        return wrapUser;
    }
}
