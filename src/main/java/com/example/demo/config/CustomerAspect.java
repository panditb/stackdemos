package com.example.demo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerAspect {

    @Around("com.example.demo.config.JoinPointConfig.handleCustomerDetails(custName)")
    public Object  aroundCustomerAdvice(ProceedingJoinPoint joinpoint, String custName) {
        System.out.println("Start aspect");

        Object result= null;
        try {
            result = joinpoint.proceed();

        }
        catch(Throwable e) {}
        return result;
    }
}
