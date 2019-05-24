package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    @Deprecated
    public static void main( String[] args ) {

        //using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean beanLifeCycleDemoBean=(BeanLifeCycleDemoBean) applicationContext.getBean("beanlifecycledemobean");
        beanLifeCycleDemoBean.customDestroy();

    }
}
