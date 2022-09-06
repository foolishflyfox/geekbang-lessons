package com.bfh.bean;

import org.springframework.stereotype.Component;

/**
 * @author benfeihu
 */
@Component
public class A {
    /**
     * A 依赖于组件 B，导致 B 先初始化
     * 构造器注入不需要写 @Autowired
     * @param b
     */
    public A(B b) {
        System.out.println("A(b) constructor");
    }
}
