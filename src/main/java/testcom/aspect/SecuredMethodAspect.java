package testcom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecuredMethodAspect {

    @Pointcut("@annotation(secured)")
    public void callAt(Secured secured) {
    }

    @Around("callAt(secured)")
    public Object around(ProceedingJoinPoint pjp, Secured secured) throws Throwable {
        if (secured.isLocked()) {
        	 System.out.println(pjp.getSignature().toLongString() + " is locked");
            return null;
        } else {
            return pjp.proceed();
        }
    }
}
