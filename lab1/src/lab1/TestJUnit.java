/* Benjamin Brandt
 * Test Class for Lab1
    Tests the daysTo method
 */
package lab1;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;

/**
 *
 * @author tue94788
 */
public class TestJUnit {

    int test1 = 365;
    int test2 = 396;
    
@Test
    public void testDaysBetweenPositive1() {
        try {
            Date day1 = new Date(2011, 10, 9);
            Date day2 = new Date(2012, 10, 9);

            assertEquals(test1, day1.daysBetween(day2));
        } catch (Exception e) {
            fail();
        }
    }
@Test
    public void testDaysBetweenPositive2() {
        try {
            Date day1 = new Date(2009, 10, 10);
            Date day2 = new Date(2010, 11, 11);

            assertEquals(test2, day1.daysBetween(day2));
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void testDaysBetweenNegative1() {

        try {
            Date day1 = new Date(2010, 25, 25);
            fail();
        } catch (Exception e) {
        }
    }
@Test
    public void testDaysBetweenNegative2() {
        try {
            Date day1 = new Date(2010, 34, 12);
            fail();
        } catch (Exception e) {
        }
    }
    @Test
    public void testDaysBetweenNegative3() {
         try {
            Date day1 = new Date(-2000, 5, 5);
            fail();
        } catch (Exception e) {
        }

    }

}
