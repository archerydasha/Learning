package simpleaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/17/2016.
 */
@Component
@Aspect
public class FireSecurity {

    @Pointcut("execution(** Performance.perform(..))")
    public void performance() {
    }

    ;

    @Around("performance()")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("Fire security is preparing");
        try {
            joinPoint.proceed();
        } catch (FireException fe) {
            System.out.println("Fire is being extinguished");
        } catch (Throwable throwable) {
            System.out.println("Something went terribly wrong");
        }
    }
}
