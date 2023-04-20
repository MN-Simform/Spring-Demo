package com.example.SpringDemo;

import com.example.SpringDemo.properties.ExternalService;
import com.example.SpringDemo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Component
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringDemoPropertiesApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringDemoPropertiesApplication.class);

    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(SpringDemoScopeApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoPropertiesApplication.class);

        ExternalService externalService = applicationContext.getBean(ExternalService.class);

        logger.info("Service {}", externalService.returnServiceUrl());

    }
}
