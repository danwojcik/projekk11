package com.danwo.java8.funcionalInterfaces.bankSample;

public class InterestCounter implements Runnable {
    private String counter;

    public InterestCounter(String counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(counter + " started counting interests for bank customers.");
    }
}
