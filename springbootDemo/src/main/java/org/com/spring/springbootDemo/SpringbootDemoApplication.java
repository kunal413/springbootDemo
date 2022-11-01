package org.com.spring.springbootDemo;

import org.com.spring.springbootDemo.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {
	public static MessageService messageService;
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringbootDemoApplication.class, args);
		messageService =context.getBean("messageService",MessageService.class);
		String s = messageService.HelloWorld();
		System.out.println("s = " + s);
	}

}
