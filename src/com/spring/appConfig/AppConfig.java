package com.spring.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.spring.beans.HelloBean;
import com.spring.beans.WelcomeBean;

@Configuration
public class AppConfig 
{
	@Bean
	public WelcomeBean welcomeBean()
	{
		WelcomeBean wb=new WelcomeBean();
		wb.setName("WelcomeBean Bean");
		return wb;
	}
	
	@Bean
	public HelloBean helloBean()
	{
		
		HelloBean hb=new HelloBean();
		hb.setName("HelloBean Bean");
		return hb;
	}
}
