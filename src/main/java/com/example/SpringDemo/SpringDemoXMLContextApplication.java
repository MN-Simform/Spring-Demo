package com.example.SpringDemo;

import com.example.SpringDemo.basic.BinarySearch;
import com.example.SpringDemo.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 public class SpringDemoXMLContextApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringDemoXMLContextApplication.class);

	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(SpringDemoBasicApplication.class, args);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		logger.info("Loaded Beans : {}", (Object) applicationContext.getBeanDefinitionNames());

		XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
		logger.info("{}", xmlPersonDAO);
		logger.info("{}", xmlPersonDAO.getXmlJdbcConnection());
	}
}
