package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.joda.time.LocalTime;

public class MainApp 
{
      public static void main(String[] args)
      {
         LocalTime currentTime = new LocalTime();
         ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
         HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
         obj.getMessage();
      }
}
