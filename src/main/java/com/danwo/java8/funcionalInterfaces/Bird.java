package com.danwo.java8.funcionalInterfaces;

public class Bird implements Movable {
    private String birdName;

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String move() {
        return birdName + " is flying!";
    }
}
