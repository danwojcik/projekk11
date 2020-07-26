package com.danwo.homework.home1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Car extends Vehicle {
    private String kind;

    public Car(String name, String kind) throws FileNotFoundException {
        super(name);
        this.kind = kind;

    }

    public String getKind() {
        return kind;
    }
}
