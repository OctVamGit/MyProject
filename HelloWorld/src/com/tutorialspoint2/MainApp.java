package com.tutorialspoint2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
   public static void main(String[] args) {
      AbstractApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();
      
      obj.setMessage("Vamshi's Dependency Injection");
      //System.out.println("hello");
      context.registerShutdownHook();
      
     /* HelloWorld obj1 = (HelloWorld)context.getBean("helloWorld");
      obj1.getMessage();*/
   }
}