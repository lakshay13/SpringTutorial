package aspectprogramming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lakshay13@gmail.com
 */
@ContextConfiguration(locations = {"/spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ConversionOperationNonAspectOrientedTest {

    @Autowired
    ConversionOperationNonAspectOriented conversionOperationNonAspectOriented;

    @Test
    public void testAspectOrientedProgramming() {
        conversionOperationNonAspectOriented.stringMethod("Aspect Oriented");
        conversionOperationNonAspectOriented.decimalMethod(1.0f);
        conversionOperationNonAspectOriented.intMethod(1);
    }



}
