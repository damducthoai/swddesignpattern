package com.butchjgo.abstractdemo;

public class Cake {
    private String name;

    private Cake.Type type;

    public enum Type {
        ANGEL, PLUM, TEA
    }

    public Cake(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
