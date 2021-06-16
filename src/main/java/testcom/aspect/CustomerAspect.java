package testcom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CustomerAspect {

    @Around("execution(public String testcom.aspect.Customer.getName(..))")
    public Object retrieveName(@SuppressWarnings("unused") final ProceedingJoinPoint invocation)
            throws Throwable {
        System.out.println("***Aspect invoked before calling getName()***");
        final Object obj = invocation.proceed();
        System.out.println("***Aspect invoked after calling getName()***");
        return obj;
    }

}
