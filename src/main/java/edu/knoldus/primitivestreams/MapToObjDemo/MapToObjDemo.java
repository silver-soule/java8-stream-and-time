package edu.knoldus.primitivestreams.MapToObjDemo;

import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by Neelaksh on 19/8/17.
 */
public class MapToObjDemo {
    String modelName;
    private final static double invalidSpeed = -1;

    MapToObjDemo(String modelName) {
        this.modelName = modelName;
    }

    List<Car> standardModelGenerator(DoubleSupplier seed, int totalCount) {
        return DoubleStream.generate(seed).limit(totalCount)
                .mapToObj(maxSpeed -> new Car(maxSpeed, modelName))
                .collect(Collectors.toList());
    }

    double averageSpeed(Stream<Car> carStream) {
        return carStream.mapToDouble(Car::getMaxSpeed).average().orElse(invalidSpeed);
    }
}
