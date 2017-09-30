package com.butchjgo.factory;

import com.butchjgo.abstractdemo.AbstractFactory;
import com.butchjgo.abstractdemo.CakeFactory;
import com.butchjgo.abstractdemo.CakeService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CarFactory extends AbstractFactory implements CarFactoryService {

    private static final Logger LOGGER = Logger.getLogger("Car Factory");

    public CarFactory() {
        LOGGER.log(Level.INFO, "Car Factory constructed");
    }

    @Override
    public Car getVehincleCar() {
        LOGGER.log(Level.INFO, "new vehincle car created");
        return new Car(Car.Types.VEHICLE);
    }

    @Override
    public Car getSportCar() {
        LOGGER.log(Level.INFO, "new sport car created");
        return new Car(Car.Types.SPORT);
    }

    @Override
    public Car getCar(Car.Types type) {
        LOGGER.log(Level.INFO, "new car created. Type: " + type);
        return new Car(type);
    }
}
