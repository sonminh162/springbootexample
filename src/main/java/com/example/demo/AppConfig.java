package com.example.demo;

import com.example.demo.model.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    SimpleBean simpleBeanConfigure() {
        return new SimpleBean("loda");
    }


}
