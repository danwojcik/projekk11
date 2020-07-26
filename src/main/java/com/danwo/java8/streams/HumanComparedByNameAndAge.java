package com.danwo.java8.streams;

import java.util.Comparator;

public class HumanComparedByNameAndAge implements Comparator<Human> {
    @Override
    public int compare(Human human1, Human human2) {
        //najpierw sprawdzamy czy imie jest takie samo
        if (!human1.getName().equals(human2.getName())){
            //jak nie jest to szeregujemy po imieniu
            return human1.getName().compareTo(human2.getName());
        }
        //jak imie jest takie samo to szeregujemy po wieku
        return human1.getAge() - human2.getAge();
    }
}
