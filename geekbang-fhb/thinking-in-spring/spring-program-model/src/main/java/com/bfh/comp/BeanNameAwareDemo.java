package com.bfh.comp;

import lombok.Getter;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author benfeihu
 * BeanNameAware 接口可以注入组件名
 */
//@Component
public class BeanNameAwareDemo implements BeanNameAware {

    @Getter
    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
