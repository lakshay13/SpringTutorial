package springdependency;

import org.springframework.stereotype.Component;

/**
 * @Component: annotation allows spring to be able to create the service that needs to be injected in another class.
 * @author lakshay13@gmail.com
 */
@Component
public class Addition {

    private int input1;
    private int input2;

    public Addition() {}

    public Addition(int input1, int input2) {
        this.input1=input1;
        this.input2=input2;
    }

    public int add(int input1, int input2) {
        return input1+input2;
    }
}
