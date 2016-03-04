package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by LynAs on 03-Mar-16
 */
@Component
public class RMICaller {
    @Autowired
    TestService testService;

    public void get(){
        System.out.println(testService.get());
    }
}
