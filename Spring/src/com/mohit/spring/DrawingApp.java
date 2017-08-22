package com.mohit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by MOHIT AGARWAL on 17-04-2016.
 */
public class DrawingApp {


    public static void main(String[] args){
   // Triangle ob=new Triangle();
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        factory.getBean("triangle");
        Triangle ob=(Triangle) factory.getBean("triangle");


     ob.draw();
    }
}
