import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springdependency.Addition;

/**
 * @RunWith: This basically kind of instantiates the spring and it needs an application context to be instantiated.
 * @ContextConfiguration: This basically provides the location of the application context that spring needs for
 * instantiation and within the xml, it provides the location of the package where spring will need to search
 * for the components/beans.
 * @Autowired: Autowired annotation needs to be added so as to allow Spring to inject the service
 * @author lakshay13@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/applicationContext.xml"})
public class DependencyInjectionExampleTest {

    @Autowired
    private Addition addition;

    @Test
    public void getAdditionResult() {
        System.out.println("Result of addition of 5 & 7 is " + addition.add(5,7));
        System.out.println("Exiting the method");
    }
}
