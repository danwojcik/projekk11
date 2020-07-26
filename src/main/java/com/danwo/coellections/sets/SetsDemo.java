package com.danwo.coellections.sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.danwo.coellections.Car;

public class SetsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("vlovo", "diesel", 180);
        Car car2 = new Car("ford", "gas", 190);
        Car car3 = new Car("BMW", "diesel", 240);
        Car car4 = new Car("fiat", "gasoline", 150);

        //Set przechowuje zestaw niepowtarzalnych obiektow

        //Set to interface, HashSet to konkretna implementacja
        //najbardziej podstawowa, najczesciej uzywana
        //przechowuje dane nieposortowane, bez gwarancji kolejnosci odczytu
        //przechowywanie w tabeli hashujacej
        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car3);
        cars.add(car1);
        cars.add(car4);
        System.out.println("dodalem 6 elementow, a rozmiar seta to " + cars.size());

        for (Car car : cars) {
            System.out.println(car.getName() + " speed: " + car.getMaxSpeed());
        }
        cars.remove(car2);
        if(cars.contains(car2)){
            System.out.println("mialo usunc car2, a nie usunelo");
        }
        else {
            System.out.println("car2 usuniety");
        }
        //TreeSet zaklada przechowywanie w porzadku naturalnym albo wedlug zadanego comporatora
        /*Set<Car> carTreeSet = new TreeSet<>();
        System.out.println("czy set pusty" + carTreeSet.isEmpty());
        carTreeSet.add(car1);
        carTreeSet.add(car2);
        carTreeSet.add(car1);
        carTreeSet.add(car3);
        carTreeSet.add(car4);
        */
        //linkedHashSet pamieta kolejnosc w jakiej obiekty byly wprowadzane do kolekcji
        System.out.println("linked hash set");
        Set<Car> linkedCars = new LinkedHashSet<>();
        linkedCars.add(car1);
        linkedCars.add(car2);
        linkedCars.add(car2);
        linkedCars.add(car3);
        linkedCars.add(car4);
        for (Car linkedCar : linkedCars) {
            System.out.println(linkedCar);
        }
        System.out.println("wyswietlanie tylko car3 jesli jest");
        for (Car linkedCar : linkedCars) {
            if(linkedCar.equals(car3)) {
                System.out.println(linkedCar);
            }
        }
    }
}
