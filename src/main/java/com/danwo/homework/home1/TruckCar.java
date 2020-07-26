package com.danwo.homework.home1;

import java.io.FileNotFoundException;

public class TruckCar extends Car implements Freight {

    private int freightWeight;

    public TruckCar(String name, String kind) throws FileNotFoundException {
        super(name, kind);
    }

    public int getFreightWeight() {
        return freightWeight;
    }

    public void setFreightWeight(int freightWeight) {
        this.freightWeight = freightWeight;
    }

    @Override
    public int carry() {
        return freightWeight;
    }
}
