/*
Benjamin Brandt CIS 3138 
Main class to run testing on Date Lab
Returns true if the method passed all tests
*/
package lab1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tue94788
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJUnit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
