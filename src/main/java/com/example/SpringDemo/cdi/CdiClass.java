package com.example.SpringDemo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

//@Component //Using Spring
@Named //Using CDI
public class CdiClass {

//    @Autowired // Using Spring
    @Inject
    CdiDAO cdiDAO;

    public CdiDAO getCdiDAO() {
        return cdiDAO;
    }

    public void setCdiDAO(CdiDAO cdiDAO) {
        this.cdiDAO = cdiDAO;
    }
}
