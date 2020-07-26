package com.danwo.coellections.maps;

import com.danwo.coellections.Car;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("vlovo", "diesel", 180);
        Car car2 = new Car("ford", "gas", 190);
        Car car3 = new Car("BMW", "diesel", 240);
        Car car4 = new Car("fiat", "gasoline", 150);

        //mapa (klucz, wartosc)
        Map<String, Car> mapOfCarsByName = new HashMap<>();
        mapOfCarsByName.put(car1.getName(), car1);
        mapOfCarsByName.put(car2.getName(), car2);
        mapOfCarsByName.put(car3.getName(), car3);
        mapOfCarsByName.put(car4.getName(), car4);
        //iterowanie po mapie #1
        mapOfCarsByName.values(); //zwraca zestaw wartosci
        System.out.println("\nprint from map by vales");
        for (Car value : mapOfCarsByName.values()) {
            System.out.println(value);
        }
        //iterowanie po mapie #2
        System.out.println("\nprint from map by keySet");
        mapOfCarsByName.keySet(); //zwraca zestaw kluczy
        for (String s : mapOfCarsByName.keySet()) {
            System.out.println("map key : " + s);
            System.out.println(mapOfCarsByName.get(s));
        }
        //iterowanie po entry - wpisie
        System.out.println("\nprint from map by entrySet");
        mapOfCarsByName.entrySet(); //zwraca zestaw wpisow Entry<key, value>
        for (Map.Entry<String, Car> carEntry : mapOfCarsByName.entrySet()) {
            System.out.println("Key : " + carEntry.getKey());
            System.out.println(carEntry.getValue());
        }

        //klucz musi byc unikalny wiec pod kluczem ponizej nastepuje podmiana wartosi czyli obiektu Car
        mapOfCarsByName.put(car1.getName(), new Car ("Volvo V50", "diesel", 220));
        mapOfCarsByName.put(car3.getName(), car3);
        System.out.println("\nprint from map by values after swap");
        for (String key : mapOfCarsByName.keySet()) {
            System.out.println("key is : " + key);
            System.out.println(mapOfCarsByName.get(key));
        }
        mapOfCarsByName.remove("fiat"); //usuwa po kluczu
        mapOfCarsByName.remove("volvo", car1); //usuwa po kluczu i wartosci

        System.out.println();
        if(mapOfCarsByName.containsKey("BMW")){
            System.out.println("BMW on there");
        }
        if(mapOfCarsByName.containsValue(car2)){
            System.out.println("car2 on there: " +car2);
        }
        System.out.println();
        mapOfCarsByName.isEmpty();
        mapOfCarsByName.size();
    }
}
