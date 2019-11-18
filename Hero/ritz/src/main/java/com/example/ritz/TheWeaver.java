package com.example.ritz;

import android.util.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TheWeaver {

    @Before("execution(* com.example.ritz.Cheese.sayChop(..))")
    public void bulbs(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Please work");
        Log.w("Lightbulb","We successfully weaved");
        joinPoint.proceed();
    }


}
