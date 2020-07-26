package com.danwo.homework.home1;

public class Ship extends Vehicle {
    public boolean isOceanic() {
        return oceanic;
    }

    private boolean oceanic = true;
    private boolean river = false;

    public Ship(String name, boolean oceanic) {
        super(name);
        this.oceanic = oceanic;
    }

    @Override
    public String transportFromTo(String from, String to) {
        return "Water transport starting in " + from + "going to " + to;
    }
}
