package com.danwo.java8.funcionalInterfaces;
/*
Java 8 wprowadziła interfejsy funkcyjne
określają one że jest tylko jedna metoda abstrakcyjna w interfejsie
tą jedna metode nalezy obsluzyc czyli zaimplementowac (inne mozna ale nie trzeba)
*/
@FunctionalInterface
public interface Movable {
    String move(); //ta metoda jest domyślnie public abstract

    default String moveWhith(String partner){
        return move() + " " + partner;
    }
    default String moveAlone(String reason){
        return "Travelling alone because of " + reason;
    }
}
