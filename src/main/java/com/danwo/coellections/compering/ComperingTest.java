package com.danwo.coellections.compering;

import com.danwo.coellections.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComperingTest {
    public static void main(String[] args) {
        Car car1 = new Car("vlovo", "diesel", 180);
        Car car2 = new Car("ford", "gas", 190);
        Car car3 = new Car("BMW", "diesel", 240);
        Car car4 = new Car("fiat", "gasoline", 150);


        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        System.out.println("drukujemy liste posortowana wg predkosci");
        Collections.sort(carList);
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println("\ndrukujemy liste posortowana wg silnika");
        Collections.sort(carList, new CarComparedByEngine());
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println("\ndrukujemy liste posortowana wg predkosci i silnika");
        Car car5 = new Car("vlovo", "gasolina", 180);
        Car car6 = new Car("ford", "gasolina + gas", 190);
        carList.add(car5);
        carList.add(car6);
        Collections.sort(carList, new CarComparedBySpeedAndEngine());
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
