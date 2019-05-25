package com.stackroute.awareinterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware {

    public void setBeanName(String s) {
        System.out.println("BeanName is: "+s);
    }
}