package com.qiqiaotech.something.impl;

import com.qiqiaotech.annotation.SomeTag;
import com.qiqiaotech.something.SomeObject;
import org.springframework.stereotype.Component;

@Component
public class SomeObjectImpl implements SomeObject {

    @SomeTag
    @Override
    public void printSomething() {
        System.out.println("print Something");
    }
}
