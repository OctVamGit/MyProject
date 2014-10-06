package com.dependenyinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String args[]){
		
		 AbstractApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans1.xml");
		 TextPad tp = (TextPad)context.getBean("textPad");
		 
		 System.out.println(tp.getSpellMessage());
	}
	
}
