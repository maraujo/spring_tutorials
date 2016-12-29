package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by matheus on 29/12/16.
 */
@Component
public class HelloBean {
    public String sayHello(){
        return "Say Hello World";
    }
}
