package com.abhi.lc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.abhi.lc.controller")
@EnableWebMvc
public class MyConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolverBean() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new MyPhoneFormatter());
		registry.addFormatter(new CurrencyFormatter());
		registry.addFormatter(new CreditCardFormatter());
	}

}
