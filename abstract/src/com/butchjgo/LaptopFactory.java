package com.butchjgo;

public class LaptopFactory extends AbstractFactory {

    @Override
    public Server getServer() {
        return null;
    }

    @Override
    public Laptop getLaptop() {
        return new Laptop("SDRAM 8GB", "128GB SSD", "Intel Core i7 7700u", "15 inch ISP");
    }
}
