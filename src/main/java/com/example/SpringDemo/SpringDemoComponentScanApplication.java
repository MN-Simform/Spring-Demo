package com.example.SpringDemo;

import com.example.SpringDemo.scope.PersonDAO;
import componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Component
@ComponentScan("componentScan")
public class SpringDemoComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoComponentScanApplication.class);

    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(SpringDemoComponentScanApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoComponentScanApplication.class);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);

    }
}
