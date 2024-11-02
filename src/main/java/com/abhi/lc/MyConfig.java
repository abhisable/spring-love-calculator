package com.abhi.lc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.abhi.lc.controller")
@EnableWebMvc
public class MyConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolverBean() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}

}
