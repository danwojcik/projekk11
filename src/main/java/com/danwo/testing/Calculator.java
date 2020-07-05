package com.danwo.testing;
public class Calculator {
    public double add(double a, double b){
        return a+b;
    }
    public double minus(double a, double b){
        return a-b;
    }
    public double div(double a, double b){
        return a*b;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        assert 5.0 == calculator.add(2, 3);
    }
}
