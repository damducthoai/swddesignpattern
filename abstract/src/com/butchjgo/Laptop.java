package com.butchjgo;

public class Laptop extends Computer {

    private String screenSize;

    public Laptop(String RAM, String HDD, String CPU, String screenSize) {
        super(RAM, HDD, CPU);
        this.screenSize = screenSize;
        super.type = Computers.LAPTOP;
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
        return this.screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize='" + screenSize + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}
