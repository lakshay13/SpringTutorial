package autowiring;

import org.springframework.stereotype.Component;

/**
 * @author lakshay13@gmail.com
 */
@Component
public class MultiplyOperation implements MathOperation {

    public void performOperation() {
        System.out.println("This class will perform multiplication operation");
    }
}
