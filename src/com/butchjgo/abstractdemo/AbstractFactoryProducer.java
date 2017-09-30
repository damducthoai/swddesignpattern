package com.butchjgo.abstractdemo;

import com.butchjgo.factory.CarFactory;

public class AbstractFactoryProducer {
    public enum FactoryType {
        Cake, Car
    }

    public AbstractFactoryProducer() {
    }

    public static AbstractFactory getFactory(FactoryType type) {
        switch (type) {
            case Car:
                return new CarFactory();
            case Cake:
                return new CakeFactory();
            default:
                return null;
        }
    }
}
