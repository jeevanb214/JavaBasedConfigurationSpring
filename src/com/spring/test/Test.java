package com.spring.test;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.appConfig.AppConfig;
import com.spring.beans.HelloBean;
import com.spring.beans.WelcomeBean;



public class Test {

	public static void main(String[] args) {

		ApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*
		 * WelcomeBean welBean1=(WelcomeBean) cxt.getBean("welcomeBean"); //By method
		 * calling System.out.println(welBean1.getWelcomeBeanMessage()); WelcomeBean
		 * welBean2=(WelcomeBean) cxt.getBean(WelcomeBean.class); //By class calling
		 * System.out.println(welBean2.getWelcomeBeanMessage());
		 * System.out.println(welBean1 == welBean2); //which reprents singleton scope
		 */		
	
		WelcomeBean welBean1=(WelcomeBean) cxt.getBean("welcomeBean"); 
		System.out.println(welBean1.getWelcomeBeanMessage());
		System.out.println(welBean1.getName());
		
		HelloBean helloBean=(HelloBean) cxt.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		System.out.println(helloBean.getName());
	
	
	}
}
