package com.danwo.java8.lambdas;

public class Samples {
    public static void main(String[] args) {

        //pre java 8
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("doing some stuff multithread");
            }
        });
        thread.start();

        //since java 8
        // () -> {}
        // (args) -> {work on args}
        Thread threadNew = new Thread(() -> {
            System.out.println("doing another thread stuff multithread");
        });
        threadNew.start();

        //Lambdas (jakies argumenty) - zero albo wiecej, mozna podac typy ale nie koniecznie
        // -> operator pomiedzy lista argumentow a wykonywaniem
        // {jakas akcja} - wykonywana akcja (metoda, proces)
        String argument1 = "aaa";
        String argument2 = "bbb";
        //StringAdding adding = (arg1, arg2) -> {return argument1 + " " + argument2};
        //StringAdding addingWithTypes = (String arg1, String arg2) -> {return argument1 + " " + argument2};

        //System.out.println(adding);
        }
    }
