package edu.mum.ea.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by darith on 7/19/17.
 */


public class Main {

    private final static String[] contexts = {
            "/context/common.xml",
            "/context/gateway.xml",
            "/context/amqp-context.xml",
            "/context/jms-context.xml"

    };

    public static void main(String[] args) {

        new ClassPathXmlApplicationContext(contexts);

    }


}
