package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    @Deprecated
    public static void main( String[] args ) {

        //using BeanFactory
        ClassPathResource resource= new ClassPathResource("beans.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        Movie movie1=beanFactory.getBean("movie",Movie.class);
        System.out.println("Actor details using BeanFactory:\n"+movie1+"\n");

        //using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie)applicationContext.getBean("movie");
        System.out.println("Actor details using ApplicationContext:\n"+movie2+"\n");

    }
}
