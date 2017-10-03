package com.butchjgo;

import java.util.logging.Logger;

public class AbstractApps {
    private static final Logger LOGGER = Logger.getLogger("Cake factory");

    public static void main(String[] args) {
        AbstractFactory laptopFactory = new LaptopFactory();
        AbstractFactory serverFactory = new ServerFactory();

        Computer laptop = laptopFactory.getLaptop();
        LOGGER.info(laptop.toString());
        assert (laptop.type == Computer.Computers.LAPTOP);
        assert (laptopFactory.getServer() == null);

        Computer server = serverFactory.getServer();
        LOGGER.info(server.toString());
        assert (server.type == Computer.Computers.SERVER);
        assert (serverFactory.getLaptop() == null);
    }
}
