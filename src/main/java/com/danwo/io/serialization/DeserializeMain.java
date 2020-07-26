package com.danwo.io.serialization;

import java.io.*;

public class DeserializeMain {
    public static void main(String[] args) {
        SerialPerson person = null;

        try {
            FileInputStream fis = new FileInputStream("SerializedPerson.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            person = (SerialPerson) ois.readObject();
            System.out.println(person.getAge() + " " + person.getSurname());

            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
