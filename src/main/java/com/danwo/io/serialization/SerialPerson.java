package com.danwo.io.serialization;

import java.io.Serializable;

public class SerialPerson implements Serializable {
    //transient oznacza ze tego pola nie przepychamy przez serializacje
    private transient int id;
    private String name;
    private String surname;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public SerialPerson (int id, String name, String surname, int age){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SerialPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
