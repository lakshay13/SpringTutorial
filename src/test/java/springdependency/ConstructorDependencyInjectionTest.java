package springdependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lakshay13@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/applicationContext.xml"})
public class ConstructorDependencyInjectionTest {

    @Autowired
    private Addition addition;


    @Test
    public void getAdditionResult() {

        // Initialize the constructor with the dependency
        ConstructorInjectionExample cie = new ConstructorInjectionExample(addition);
        // Call a method in that class which will use this dependency passed
        cie.getResults();
        System.out.println("Exiting the method");
    }
}
