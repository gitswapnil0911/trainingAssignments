package com.training.advices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAdvice {

    @Around("execution(* com.training.beans.PaymentImpl.*(..))")
    public Object loggingAdvice(ProceedingJoinPoint pjp) throws Throwable{

        Logger log = LogManager.getLogger();


        System.out.println(pjp.getSignature());
        System.out.println(pjp.getArgs()[0]);

        log.info("Logging using log4j");
        System.out.println("Before Executing Method");
        Object obj = (Double)pjp.proceed() + 10;

        System.out.println("After Executing Method");

        return obj;
    }

}
