package com.danwo.homework.home1;

public abstract class Vehicle implements Transport {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
