package com.example.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JoinPointConfig {
    @Pointcut(value="execution(* com.example.demo.controller.CustomerService.getDetails(..)) && args(custName)")
    public void handleCustomerDetails(String custName) {

    }
}