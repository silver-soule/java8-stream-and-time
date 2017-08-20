package edu.knoldus.primitivestreams.MapToObjDemo;

/**
 * Created by Neelaksh on 19/8/17.
 */
public class Car {
    private final double maxSpeed;
    private final String carName;

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getCarName(){
        return this.carName;
    }

    Car(double maxSpeed, String carName) {
        this.maxSpeed = maxSpeed;
        this.carName = carName;
    }

    Car(double maxSpeed) {
        this(maxSpeed, "default");
    }

}
