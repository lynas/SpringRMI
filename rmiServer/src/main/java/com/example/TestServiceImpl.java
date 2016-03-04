package com.example;

import org.springframework.stereotype.Service;

/**
 * Created by LynAs on 03-Mar-16
 */
@Service
public class TestServiceImpl implements TestService{
    @Override
    public int get() {
        return 119;
    }
}
