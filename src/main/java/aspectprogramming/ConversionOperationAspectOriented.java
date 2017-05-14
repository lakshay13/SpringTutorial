package aspectprogramming;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author lakshay13@gmail.com
 * Class that takes into account Aspect Oriented Programming and hence
 * logger information is not repeated in every method and rather placed
 * in the before method.
 */
@Aspect
@Component
class AspectSetup {

    private Logger logger = Logger.getLogger(AspectSetup.class.toString());

    @Before("execution(* aspectprogramming.ConversionOperationAspectOriented.*(..))")
    public void before(JoinPoint joinpoint) {
        //Method that gets executed before every method call in ConversionOperationAspectOriented class
        logger.info("Executing method ---> " + joinpoint.getSignature().getName());
    }
}

@Component
public class ConversionOperationAspectOriented {

    private Logger logger = Logger.getLogger(ConversionOperationAspectOriented.class.toString());

    public void stringMethod(String s) {
        logger.info("The value is " + s);

    }

    public void decimalMethod(Float f) {
        logger.info("The value is " + f);

    }

    public void intMethod(int i) {
        logger.info("The value is " + i);
    }

}
