package com.bfh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author benfeihu
 */
@Component
public class C {
    B b;
    B2 b2;

    @Autowired(required = false)
    public void setB(B b) {
        System.out.println("C.setB(b), b = " + b);
        this.b = b;
    }

    @Autowired(required = false)
    public void setB2(B2 b2) {
        System.out.println("C.setB2(b2), b2 = " + b2);
        this.b2 = b2;
    }

    @PostConstruct
    public void foo() {
        System.out.println("C PostConstruct");
    }
}
