package com.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("configuration.properties")
public class SpringBootDefaultController {

	
	public static void main(String []args)
	{
		new SpringApplication(SpringBootDefaultController.class)
		.run(args);
	}

}
