package aspectprogramming;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author lakshay13@gmail.com
 *
 * Class that does not take into account Aspect Oriented Programming and hence
 * logger information is repeated in every method.
 */
@Component
public class ConversionOperationNonAspectOriented {

    private Logger logger = Logger.getLogger(ConversionOperationNonAspectOriented.class.toString());

    public void stringMethod(String s) {
        logger.info("Entering String method");
        logger.info("The value is " + s);

    }

    public void decimalMethod(Float f) {
        logger.info("Entering decimal method");
        logger.info("The value is " + f);

    }

    public void intMethod(int i) {
        logger.info("Entering integer method");
        logger.info("The value is " + i);
    }
}
