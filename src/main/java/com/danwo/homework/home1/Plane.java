package com.danwo.homework.home1;

public class Plane extends Vehicle {
    public String getEngine() {
        return engine;
    }

    private String engine;

    public Plane(String name, String engine) {
        super(name);
        this.engine = engine;
    }

}
