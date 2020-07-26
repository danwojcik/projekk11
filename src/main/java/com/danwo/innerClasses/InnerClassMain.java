package com.danwo.innerClasses;

public class InnerClassMain {
    public static void main(String[] args) {
        //najpierw obiekt zewnetrzny
        CommonCar commonCar = new CommonCar();
        //potem na nim wolamy new dla obiektu klasy wezwnetrzej
        CommonCar.Engine engine = commonCar.new Engine();

    }
}
