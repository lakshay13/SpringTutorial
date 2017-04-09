package autowiring;

import org.springframework.stereotype.Component;

/**
 * @Component: annotation allows spring to be able to create the service that needs to be injected in another class.
 * @author lakshay13@gmail.com
 */
@Component
public class DerivativeOperation implements ComplexMathOperation {

    public void performComplexMathOperations() {
        System.out.println("This class will perform complex derivative operation");
    }
}
