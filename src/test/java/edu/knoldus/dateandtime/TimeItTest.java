package edu.knoldus.dateandtime;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Neelaksh on 21/8/17.
 */
public class TimeItTest {
    TimeIt timeIt = new TimeIt(1995, 9, 29);

    @Test
    public void getAgeInYears() throws Exception {
        assertEquals(timeIt.getTimeInYears(2017, 8, 21), 21.83, 0.133);
    }

    @Test
    public void getAgeInMonths() throws Exception {
        assertEquals(timeIt.getTimeInMonths(2017, 8, 21), 262, 1);
    }

}