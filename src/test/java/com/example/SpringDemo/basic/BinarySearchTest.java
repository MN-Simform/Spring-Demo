package com.example.SpringDemo.basic;

import com.example.SpringDemo.SpringDemoBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringDemoBasicApplication.class)
public class BinarySearchTest {

    @Autowired
    BinarySearch binarySearch;

    @Test
    public void Test(){
        int actualRes = binarySearch.binarySearch(new int[]{1,2,3}, 3);
        assertEquals(3, actualRes);
    }

}