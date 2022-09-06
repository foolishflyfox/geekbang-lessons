package com.bfh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author benfeihu
 */
@Component
public class D {
    @Autowired(required = false)
    private B b;
    @Autowired(required = false)
    private B2 b2;

    @PostConstruct
    public void foo() {
        System.out.println("D PostConstruct");
        System.out.printf("b = %s, b2 = %s\n", b, b2);
    }
}
