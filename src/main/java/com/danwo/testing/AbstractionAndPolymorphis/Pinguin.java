package com.danwo.testing.AbstractionAndPolymorphis;

public class Pinguin  extends Bird{

    @Override
    public void move(){
        System.out.println("Pinguin is bird but a not fly");
    }
}
