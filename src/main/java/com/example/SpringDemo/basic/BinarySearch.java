package com.example.SpringDemo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

//@Component
@Service
//@Scope("prototype") // Not Recommended
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

//    public BinarySearch(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] num, int numToSearch){

        int[] sortedNum = sortAlgorithm.sort(num);
        System.out.println(sortAlgorithm);
        return 3;
    }

//    @PostConstruct
//    public void postConstruct(){
//        logger.info("postConstruct");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy");
//    }
}
