package com.danwo.coellections.lists;

import com.danwo.coellections.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("vlovo", "diesel", 180);
        Car car2 = new Car("ford", "gas", 190);
        Car car3 = new Car("BMW", "diesel", 240);
        Car car4 = new Car("fiat", "gasoline", 150);

        //definicja wszelkich kolekcji w Java 1.6 i nizej
        //List<Car> carArrayList = new ArrayList<Car>();

        //lista to interface, ArrayList do jedna z implementacji oparta o strukture tablicowa
        //elementy w uporzadkowanej kolejnosci, mozna pobrac na podstawie indeksu, moze zawierac duplikaty
        List<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car4);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        System.out.println("zawartosc array listy - z powtorzeniami");
        for (Car car : carArrayList) {
            System.out.println(car);
        }
        //lindekList jedna z implementacji oparta o wezly i powiazanie miedzy nimi
        List<Car> carLinkedList = new LinkedList<>();
        carLinkedList.add(car1);
        carLinkedList.add(car2);
        carLinkedList.add(car4);
        carLinkedList.add(car1);
        carLinkedList.add(car2);
        carLinkedList.add(car3);
        System.out.println("zawartosc linked listy - z powtorzeniami");
        for (Car car : carArrayList) {
            System.out.println(car);
        }
        /*
        kiedy ktora lista:
        najczesiej ArrayList bo wiekszosc operacji jak na tabeli
        pobranie elementu na podstawie indexu jest szybsze w ArrayList O(1) vs LinkedList O(n)
        dodawanie elementu na koniec struktury jest tak samo szybkie chyba ze dojdzie do przepelnienia bufora w ArrayList to wtedy LinkedList bedzie szybszy
        dodawanie na konkretny index jest szybsze dla linkedListy
         */

        //dodawanie do listy na konkretny index
        carArrayList.add(3, car1);
        carArrayList.add(2, car4);
        //dodawanie na koniec do add(carX)

        //carArrayList.contains() - sprawdzenie czy element jest na liscie
        carArrayList.remove(3);
        carLinkedList.remove(car3);
    }

}
