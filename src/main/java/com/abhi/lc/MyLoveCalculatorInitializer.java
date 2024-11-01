package com.abhi.lc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class MyLoveCalculatorInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		XmlWebApplicationContext context=new XmlWebApplicationContext();
		context.setConfigLocation("classpath:beans.xml");
		
		DispatcherServlet myServlet=new DispatcherServlet(context);
		
		Dynamic servlet = servletContext.addServlet("my-project-dispatcher", myServlet);
		servlet.addMapping("/myapplication.com/*");
		servlet.setLoadOnStartup(1);
		
	}

}
