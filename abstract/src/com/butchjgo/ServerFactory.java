package com.butchjgo;

public class ServerFactory extends AbstractFactory {

    @Override
    public Server getServer() {
        return new Server("ECC 512GB", "500GB - 7200RPM", "XEON E5 1230V3");
    }

    @Override
    public Laptop getLaptop() {
        return null;
    }
}
