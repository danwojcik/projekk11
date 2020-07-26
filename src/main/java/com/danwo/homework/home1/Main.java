package com.danwo.homework.home1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("car.txt");
        Scanner in = new Scanner(file);

        String zdanie1 = in.nextLine();
        String zdanie2 = in.nextLine();
        String zdanie3 = in.nextLine();
        String zdanie4 = in.nextLine();
        String zdanie5 = in.nextLine();
        boolean zdanie6 = Boolean.parseBoolean(in.nextLine());
        String zdanie7 = in.nextLine();
        boolean zdanie8 = Boolean.parseBoolean(in.nextLine());
        String zdanie9 = in.nextLine();
        String zdanie10 = in.nextLine();
        String zdanie11 = in.nextLine();
        String zdanie12 = in.nextLine();

        Car car1 = new Car (zdanie1, zdanie2);
        System.out.println("To jest car marki: " + car1.getName() + " rodzaj: " + car1.getKind());

        TruckCar truckCar1 = new TruckCar (zdanie3, zdanie4);
        System.out.println("To jest Truck marki: " + truckCar1.getName() + " rodzaj: " + truckCar1.getKind());

        Ship ship1 = new Ship(zdanie5, zdanie6);
        Ship ship2 = new Ship(zdanie7, zdanie8);
        System.out.println("To jest ship: " + ship1.getName() + " rodzaj: " + ship1.isOceanic());
        System.out.println("To jest ship: " + ship2.getName() + " rodzaj: " + ship2.isOceanic());

        Plane plane1 = new Plane(zdanie9, zdanie10);
        Plane plane2 = new Plane(zdanie11, zdanie12);
        System.out.println("To jest plane: " + plane1.getName() + " silnik: " + plane1.getEngine());
        System.out.println("To jest plane: " + plane2.getName() + " silnik: " + plane2.getEngine());
    }
}
