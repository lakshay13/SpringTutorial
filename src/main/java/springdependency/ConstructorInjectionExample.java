package springdependency;

import org.springframework.stereotype.Component;

/**
 * @author lakshay13@gmail.com
 */
public class ConstructorInjectionExample {

    private Addition addition;

    // parameterized constructor with the input as dependency of Addition class
    public ConstructorInjectionExample(final Addition addition) {
        this.addition = addition;
    }

    // get method which would use the constructor injected dependency to call the add method of its class
    public void getResults() {
        System.out.println("Result of 5 and 7 is:" + addition.add(5,7));
    }





}
