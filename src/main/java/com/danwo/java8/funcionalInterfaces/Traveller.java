package com.danwo.java8.funcionalInterfaces;

public class Traveller implements Movable {
    private String name;

    public Traveller(String name){
        this.name = name;
    }
    //metoda abstrakcyjna w interfejsie, musimy zdefiniowac w klasie
    @Override
    public String move() {
        return name + "is moving";
    }
    //metoda domyslna w interfejsie, w klasie mozemy ale nie musimy jej nadpisywac
    @Override
    public String moveAlone(String reason) {
        return "Whatever " + reason + " is.";
    }
}
