package com.example.demo.service;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    // ---------------------------------- PointCuts -----------------------------------
    @Pointcut("within(com.example.demo.service.MyService)")
    private void allMethods() {
    }


    @Pointcut("@annotation(com.example.demo.service.MyLogger)")
    private void annotatedBy() {
    }


    @Pointcut("execution(public * com.example.demo.MyService.*(..))")
    private void allMethodsInMyService() {
    }


    // ------------------------------------ Advances ----------------------------------------
    @Before(value = "allMethods()")
    public void someLogic() {
        System.out.println("Aspect Message");
    }


    @Around(value = "annotatedBy()")
    public Object aroundLogic(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before executing method");
        Object proceed = pjp.proceed();
        System.out.println("After executing method");
        return proceed;
    }

    @After(value = "allMethodsInMyService")
    public void afterLogic() {
        System.out.println("Doing something");
    }
}
