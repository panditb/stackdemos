package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/getDetails", method = RequestMethod.GET)
    public String getCustomerDetails() {
        System.out.println("Inside controller class");
        String details = customerService.getDetails("test");
        System.out.println("Customer details is = " + details); // prints null
    return details;
    }
}

