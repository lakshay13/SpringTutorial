package aspectprogramming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author lakshay13@gmail.com
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"aspectprogramming"})
class AOP {

}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= AOP.class)
public class ConversionOperationAspectOrientedTest {

    @Autowired
    ConversionOperationAspectOriented conversionOperationAspectOriented;

    @Autowired
    ConversionOperationNonAspectOriented conversionOperationNonAspectOriented;

    @Test
    public void testAspectOrientedProgramming() {
        conversionOperationAspectOriented.stringMethod("Aspect Oriented");
        conversionOperationAspectOriented.decimalMethod(1.0f);
        conversionOperationAspectOriented.intMethod(1);
    }

    @Test
    public void testNonAspectOrientedProgramming() {
        conversionOperationNonAspectOriented.stringMethod("Aspect Oriented");
        conversionOperationNonAspectOriented.decimalMethod(1.0f);
        conversionOperationNonAspectOriented.intMethod(1);
    }
}

