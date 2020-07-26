package com.danwo.innerClasses;

public class CommonCar {
    private String name;

    class Engine{
        public String getCarNameFromEngine(){
            //klasa wewnetrza ma dostep do wszystkich pol klasy zewznetrzej
            //ma tez dostep do wszystkich metod
            return name;
        }
    }
}
