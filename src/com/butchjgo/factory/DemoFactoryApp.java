package com.butchjgo.factory;

public class DemoFactoryApp {

    public static void main(String[] args) {
        CarFactoryService carFactory = new CarFactory();

        Car vehincle = carFactory.getVehincleCar();
        Car sport = carFactory.getSportCar();

        assert vehincle.getType() == Car.Types.VEHICLE;
        assert sport.getType() == Car.Types.SPORT;

        Car vehincle2 = carFactory.getCar(Car.Types.VEHICLE);
        Car sport2 = carFactory.getCar(Car.Types.SPORT);

        assert vehincle2.getType() == Car.Types.VEHICLE;
        assert sport2.getType() == Car.Types.SPORT;
    }
}
