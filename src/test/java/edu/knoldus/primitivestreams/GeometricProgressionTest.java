package edu.knoldus.primitivestreams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Neelaksh on 20/8/17.
 */
public class GeometricProgressionTest {
    GeometricProgression geometricProgression = new GeometricProgression(1, 2);

    @Test
    public void sum() throws Exception {
        assertEquals(geometricProgression.sum(10), 1 * Math.pow(2, 10) - 1, 0.001);
    }

    @Test
    public void getGPSeries() throws Exception {
        assertEquals(geometricProgression.generateGPSeries(10).get(9), 1 * Math.pow(2, 9), 0.01);
    }

}