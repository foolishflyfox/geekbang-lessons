package com.bfh.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author benfeihu
 */
@Repository
public class UserDao implements InitializingBean{
    public UserDao() {
        System.out.println("UserDao Constructor");
    }
    @PostConstruct
    public void foo() {
        System.out.println("UserDao PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserDao afterPropertiesSet");
    }
}
