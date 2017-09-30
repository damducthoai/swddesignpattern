package com.butchjgo.factory;

public interface CarFactoryService {
    Car getVehincleCar();

    Car getSportCar();

    Car getCar(Car.Types type);
}
