package com.example.demo.controller;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String getDetails(String custName) {
        //some code
        return "Customer details";
    }
}