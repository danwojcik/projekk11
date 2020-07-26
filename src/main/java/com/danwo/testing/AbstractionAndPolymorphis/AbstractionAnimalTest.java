package com.danwo.testing.AbstractionAndPolymorphis;

public class AbstractionAnimalTest {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.move();

        Fish fish = new Fish();
        fish.move();

        Pinguin pinguin = new Pinguin();
        pinguin.move();
    }
}
