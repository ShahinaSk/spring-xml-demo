package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet() !!!!");

    }

    public void customInit(){
        System.out.println("Inside customInit()!!!");
    }
    public void customDestroy(){
        System.out.println("Inside customDestroy()!!!");
    }

    public void destroy() throws Exception {
        System.out.println("Bean Destroyed!!!");
    }
}
