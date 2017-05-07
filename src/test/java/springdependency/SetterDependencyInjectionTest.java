package springdependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class aims to test the dependency injection using setter method
 * @author lakshay13@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/applicationContext.xml"})
public class SetterDependencyInjectionTest {

    private Addition addition;

    // setter method is autowired
    @Autowired
    public void setterService(final Addition addition) {
        this.addition = addition;
    }

    @Test
    public void getAdditionResult() {

        System.out.println("Result of addition of 5 & 7 is " + addition.add(5,7));
        System.out.println("Exiting the method");
    }

}
