package simpleaop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/16/2016.
 */
@Component
@Aspect
public class Audience {

    @Pointcut("execution(** Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void beforePerformance(){
        System.out.println("Audience is taking their seats before performance");
    }

    @After("performance()")
    public void afterPerformance(){
        System.out.println("Audience is coming home after performance");
    }

    @AfterReturning("performance()")
    public void afterReturningPerformance(){
        System.out.println("Audience is applauding");
    }

    @AfterThrowing("performance()")
    public void afterThrowingPerfomance(){
        System.out.println("Audience is dissatisfied");
    }
}
