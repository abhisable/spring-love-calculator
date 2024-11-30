package com.abhi.lc;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.abhi.lc")
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
		//registry.addFormatter(new CreditCardFormatter());
		
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("message");
		return source;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
       LocalValidatorFactoryBean localValidatorFactoryBean=new LocalValidatorFactoryBean();
       localValidatorFactoryBean.setValidationMessageSource(messageSource());  
       return localValidatorFactoryBean;
	}

	@Override
	public Validator getValidator() {
		// TODO Auto-generated method stub
		return validator();
	}
}
