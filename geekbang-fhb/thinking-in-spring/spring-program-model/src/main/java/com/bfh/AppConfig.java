package com.bfh;

import com.bfh.comp.BeanNameAwareDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author benfeihu
 */
@Configuration
@ComponentScan(basePackages = {"com.bfh"})
public class AppConfig {

    @Bean
    public BeanNameAwareDemo myBeanNameAwareDemo() {
        return new BeanNameAwareDemo();
    }
}
