package com.danwo.testing.encapsulation.person;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchSample {
    public void sleepThread(long millis){

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Blad w sleepThread");
            e.printStackTrace();
        }
    }
    public void sleepAndReadFile(long millis, String filename){
        try {
            Thread.sleep(millis);
            new FileReader(filename);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void sleepAndReadFileMultiCatch(long millis, String filename){
        try {
            Thread.sleep(millis);
            new FileReader(filename);
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void sleepAndReadFileCatchHierarchy(long millis, String filename){
        try {
            Thread.sleep(millis);
            new FileReader(filename);
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("MOre generic exception cought");
        }
    }
}
