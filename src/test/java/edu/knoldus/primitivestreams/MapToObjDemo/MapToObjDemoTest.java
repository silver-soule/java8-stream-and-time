package edu.knoldus.primitivestreams.MapToObjDemo;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Neelaksh on 20/8/17.
 */
public class MapToObjDemoTest {
    MapToObjDemo mapToObjDemo = new MapToObjDemo("tesla");
    final double constSpeed = 44;

    @Test
    public void standardModelGeneratorTest() throws Exception {
        List<Car> listOfCars = mapToObjDemo.standardModelGenerator(() -> constSpeed, 5);
        assertEquals(listOfCars.get(0).getCarName(), "tesla");
        assertEquals(listOfCars.get(0).getMaxSpeed(), 44, 0.01);
    }

    @Test
    public void averageSpeedTest() throws Exception {
        assertEquals(mapToObjDemo.averageSpeed(mapToObjDemo.standardModelGenerator(()->30,5).stream()),30,0.01);
    }

}