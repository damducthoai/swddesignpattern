package com.butchjgo;

public abstract class Computer {

    protected Computers type;
    String RAM, HDD, CPU;

    public Computer(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    public abstract String getScreenSize();

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }

    public Computers getType() {
        return type;
    }

    public static enum Computers {
        LAPTOP, SERVER
    }
}
