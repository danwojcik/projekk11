package com.danwo.java8.funcionalInterfaces.bankSample;

public class RaportGenerator implements Runnable {
    private String generatorName;

    public RaportGenerator(String generatorName) {
        this.generatorName = generatorName;
    }

    @Override
    public void run() {
        System.out.println(generatorName + ": Creating report");
    }
}
