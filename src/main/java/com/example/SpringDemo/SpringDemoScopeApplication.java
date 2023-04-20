package com.example.SpringDemo;

import com.example.SpringDemo.basic.BinarySearch;
import com.example.SpringDemo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Component
@ComponentScan("com.example.SpringDemo.scope")
public class SpringDemoScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(SpringDemoScopeApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoScopeApplication.class);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());

    }
}
