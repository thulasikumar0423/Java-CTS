package org.Aop.aopdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //Before Advice
   @Before( "execution(* org.Aop.aopdemo.service.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Before Method: " +
                joinPoint.getSignature().getName());
    }

    //After advice
    @After("execution(* org.Aop.aopdemo.service.*.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("After Method:" + joinPoint.getSignature().getName());
    }

    //Aftre returning advice
    //work only if method complete succssufully
    @AfterReturning(
            pointcut = "execution(* org.Aop.aopdemo.service.*.*(..))",
            returning = "result")
    public void afterReturningAdvice(Object result){
        System.out.println("Returned value: " + result);
    }

    //after throwing advice -- will work only if anu exception thrown
    @AfterThrowing(
            pointcut = "execution(* org.Aop.aopdemo.service.*.*(..))",
            throwing = "ex"
    )
    public void afterThrowingAdvice(Exception ex){
        System.out.println("Exception Occurred : " + ex.getMessage());
    }

    //Around advice -- execute before and after
    @Around("execution(* org.Aop.aopdemo.service.PaymentService.makePayment(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Around before method");
        Object result = pjp.proceed();
        System.out.println("Around after method");
        return result;
    }

}
