package com.butchjgo.factory;

public class Car {
    public static enum Types{
        SPORT,VEHICLE
    }
    private Car.Types type;

    public Car(Types type) {
        this.type = type;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
}
