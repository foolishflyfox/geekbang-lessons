package com.bfh;

import com.bfh.comp.ApplicationContextAwareDemo;
import com.bfh.comp.BeanNameAwareDemo;
import com.bfh.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author benfeihu
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        BeanNameAwareDemo beanNameAwareDemo = context.getBean(BeanNameAwareDemo.class);
        System.out.println(beanNameAwareDemo.getBeanName());
        ApplicationContextAwareDemo applicationContextAwareDemo = context.getBean(ApplicationContextAwareDemo.class);
        System.out.println(context == applicationContextAwareDemo.getApplicationContext());
    }
}
