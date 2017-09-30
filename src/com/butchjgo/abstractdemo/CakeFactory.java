package com.butchjgo.abstractdemo;

import com.butchjgo.factory.CarFactoryService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CakeFactory extends AbstractFactory implements CakeService{

    private static final Logger LOGGER = Logger.getLogger("Cake factory");

    public CakeFactory() {
        LOGGER.log(Level.INFO, "Cake Factory constructed");
    }

    @Override
    public Cake getAngelCake() {
        LOGGER.log(Level.INFO, "angel cake created");
        return new Cake("orange", Cake.Type.ANGEL);
    }

    @Override
    public Cake getPlumCake() {
        LOGGER.log(Level.INFO, "plum cake created");
        return new Cake("apple", Cake.Type.PLUM);
    }

    @Override
    public Cake getTeaCake() {
        LOGGER.log(Level.INFO, "tea cake created");
        return new Cake("melon", Cake.Type.TEA);
    }
}
