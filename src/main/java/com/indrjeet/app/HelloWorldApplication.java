package com.indrjeet.app;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(HelloWorldApplication.class, args);
		// Display the name of the bean used for auto scanning
		/*
		String[] beanNames =  ctx.getBeanDefinitionNames();

		Arrays.sort(beanNames);

		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		*/
	}

}
