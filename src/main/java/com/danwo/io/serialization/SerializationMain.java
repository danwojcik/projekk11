package com.danwo.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        SerialPerson person = new SerialPerson(22, "Jan", "Kowalski", 24);

        try {
            FileOutputStream fout = new FileOutputStream("SerializedPerson.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(person);
            oos.close();

            fout.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
