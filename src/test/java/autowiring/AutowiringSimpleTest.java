package autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class aims to test two scenarios of autowiring:
 * 1) When there is one class implementing an interface then how to autowire
 * 2) When there are two classes implementing an interface then how to autowire
 * @author lakshay13@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/applicationContext.xml"})
public class AutowiringSimpleTest {

    // ComplexMathOperation is an interface so Spring starts looking for all the implementation of this interace
    // There exist one implementation called DerivativeOperation which is invoked and the result is obtained
    @Autowired
    ComplexMathOperation complexMathOperation;

    @Autowired
    MathOperation addOperation;

    @Autowired
    MathOperation multiplyOperation;

    @Autowired
    @Qualifier(value = "addOperation")
    MathOperation mathOperation1;

    @Autowired
    @Qualifier(value = "multiplyOperation")
    MathOperation mathOperation2;

    @Test
    public void testOnlyOneClassImplementsInterface() {

        /**
         * Note:
         * When there is only one class implementing one interface then autowiring using interface name is not a problem.
         * Using complexMathOperation will indirectly give a call to Derivative Operation class method because Spring
         * searches for the implementation of the interface and since there is only one class implementing this interface
         * hence, the result is of the Derivation Operation class method.
         */
        complexMathOperation.performComplexMathOperations();
    }

    @Test
    public void testTwoClassImplementsInterface() {

        /**
         * Note:
         * When there are two classes (Add and Multiply) implementing one interface then autowiring using interface name
         * is a problem. It will give an error found 2 bean definitions instead of one. To avoid this error, there are two
         * ways:
         * a) Use Qualifier name of the class when autowiring (value = "addOperation") and (value = "multiplyOperation")
         * b) Use the name of the service as the same name as class name. (addOperation and multiplyOperation)
         */

        // Using Qualifier name of the class
        mathOperation1.performOperation();
        mathOperation2.performOperation();

        // Using name of the service as the same name as class name.
        addOperation.performOperation();
        multiplyOperation.performOperation();
    }

}
