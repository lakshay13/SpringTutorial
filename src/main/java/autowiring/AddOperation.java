package autowiring;

import org.springframework.stereotype.Component;

/**
 * @Component: annotation allows spring to be able to create the service that needs to be injected in another class.
 * @author lakshay13@gmail.com
 */
@Component
public class AddOperation implements MathOperation {

    public void performOperation() {
        System.out.println("This class will perform Add operation");
    }
}
