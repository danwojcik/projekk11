package com.danwo.java8.funcionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class TestFI {
    public static void main(String[] args) {
        Movable human = new Traveller("Jan Kowalski");
        Movable eagle = new Bird("White Eagle");

        System.out.println(human.move());
        System.out.println(human.moveAlone("to work"));

        System.out.println(eagle.move());
        System.out.println(eagle.moveAlone(" last one"));

        List<Movable> movables = new ArrayList<>();
        movables.add(human);
        movables.add(eagle);
        for (Movable movable : movables) {
            System.out.println(movable.move());
        }
    }
}
