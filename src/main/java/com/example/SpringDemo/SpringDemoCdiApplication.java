package com.example.SpringDemo;

import com.example.SpringDemo.cdi.CdiClass;
import com.example.SpringDemo.scope.PersonDAO;
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
@ComponentScan()
public class SpringDemoCdiApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringDemoCdiApplication.class);

    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(SpringDemoCdiApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoCdiApplication.class);

        CdiClass cdi = applicationContext.getBean(CdiClass.class);

        logger.info("{} dao-{}", cdi, cdi.getCdiDAO());

    }
}
