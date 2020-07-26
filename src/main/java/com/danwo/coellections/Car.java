package com.danwo.coellections;

import java.util.Comparator;
import java.util.Objects;

//inmutable class - niemutowalna klasa
//Comparatable wymusza implementacje metody compareTo
//powinien byc stosowany do uzyskania najbardziej naturalnego porzadkowania obiektow
public class Car implements Comparable<Car> {
    private String name;
    private String engine;
    private int maxSpeed;

    public Car(String name, String engine, int maxSpeed) {
        this.name = name;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //sprawdzenie referencji czyli miejsca w pamieci, jesli jest to samo miejsce to jest to ten sam obiekt
        if (this == o) return true;
        //jesli obiekt porownywany jest null albo jesli klasy obiektow sa rozne to nie ten sam obiekt
        if (o == null || getClass() != o.getClass()) return false;
        //jak powyzsze przeszo to porownujemy wszystkie pola ktore chcemy brac jako okreslajace niepowtarzalnosc obiektu
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                name.equals(car.name) &&
                engine.equals(car.engine);
    }

    @Override
    //zwraca niepotrzalany numer indentyfikacyjny obiektu
    public int hashCode() {
        //liczony na podstawie hashcodow wskazanych pol obiektu
        return Objects.hash(name, engine, maxSpeed);
        //czasami sie tak pisze na chwile
        //return 1;
    }

    @Override
    public int compareTo(Car car) {
        return this.maxSpeed - car.getMaxSpeed();
    }
}
