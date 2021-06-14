package com.example.demo;

import com.example.demo.model.SimpleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		SimpleBean simpleBean = context.getBean(SimpleBean.class);

		System.out.printf("Simple Bean Example: " + simpleBean);
	}

}
