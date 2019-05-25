package com.stackroute.awareinterface;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareDemo implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("Application Context is: "+applicationContext);
        System.out.println(applicationContext.getBean("actor"));

    }

}
