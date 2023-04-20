package com.example.SpringDemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Qualifier("quick")
public class QuickSort implements SortAlgorithm{
    public int[] sort(int[] numbers){
        return numbers;
    }
}
