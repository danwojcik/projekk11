package com.danwo.coellections.compering;

import com.danwo.coellections.Car;

import java.util.Comparator;
//comparator do porownania innym niz naturalny porzadek albo do porownan jednorazowych za pomoca klasy anonimowej
public class CarComparedByEngine implements Comparator<Car> {

    @Override
    public int compare(Car car, Car t1) {

        return car.getEngine() //w tym miejscu mam silnik car1 i ten string "silnik car1 jest porownywany z "silnik car2"
                .compareTo(t1.getEngine());
    }
}
