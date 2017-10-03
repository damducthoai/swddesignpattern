package com.butchjgo;

public class Server extends Computer {

    public Server(String RAM, String HDD, String CPU) {
        super(RAM, HDD, CPU);
        super.type = Computers.SERVER;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }

    @Override
    public String getScreenSize() {
        return null;
    }

    @Override
    public String toString() {
        return "Server{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}
