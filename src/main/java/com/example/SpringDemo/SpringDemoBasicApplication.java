package com.example.SpringDemo;

import com.example.SpringDemo.basic.BinarySearch;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
//@ComponentScan //Get Current Define Package
@ComponentScan("com.example.SpringDemo") // Can UD Package
 public class SpringDemoBasicApplication {

	public static void main(String[] args) {

//		BinarySearch bSearch = new BinarySearch(new BubbleSort());
//		int res = bSearch.binarySearch(new int[]{1, 2, 3, 4},2);
//		System.out.println(res);

//		ApplicationContext applicationContext = SpringApplication.run(SpringDemoBasicApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoBasicApplication.class);

		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch2 = applicationContext.getBean(BinarySearch.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch2);

		int res = binarySearch.binarySearch(new int[]{1,2,3,4}, 3);
		System.out.println(res);
	}
}
