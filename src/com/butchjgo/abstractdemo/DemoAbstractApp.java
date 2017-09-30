package com.butchjgo.abstractdemo;

import com.butchjgo.factory.Car;
import com.butchjgo.factory.CarFactoryService;

public class DemoAbstractApp {
    public static void main(String[] args) {
        CakeService cakeFactory = (CakeService) AbstractFactoryProducer.getFactory(AbstractFactoryProducer.FactoryType.Cake);
        CarFactoryService carFactory = (CarFactoryService) AbstractFactoryProducer.getFactory(AbstractFactoryProducer.FactoryType.Car);

        assert cakeFactory.getAngelCake().getType() == Cake.Type.ANGEL;
        assert carFactory.getSportCar().getType() == Car.Types.SPORT;
    }
}
