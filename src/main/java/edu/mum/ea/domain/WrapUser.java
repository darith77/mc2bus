package edu.mum.ea.domain;

import java.io.Serializable;

/**
 * Created by darith on 7/19/17.
 */
public class WrapUser implements Serializable {

    private User user;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
