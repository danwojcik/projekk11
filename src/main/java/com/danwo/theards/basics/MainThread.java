package com.danwo.theards.basics;

import static com.danwo.theards.ThreadColor.*;

public class MainThread {

    public static void main(String[] args) {
        //kolejnosc wykonywania watkow jest nieokreslona na x wywoal mozemy dostac x roznych kolejnosci logu na konsoli
        System.out.println(ANSI_PURPLE + "Main thread in action!");
        OtherThread otherThread = new OtherThread();
        //do wykonania watku jest potrzebna metoda start
        otherThread.setName("=======nowy zajefajny osobny watek========");
        //otherThread.run();
        otherThread.start();

        //uruchomienie z klasy implementujacej interfejs runnable
        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        //watek na klasie anonimowej
        //do uruchamiania jednorazowego
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class in action too");
            }
        }.start();

        //watek na padpisanej definicji RunnableSample
        //laczenie watkow metoda .join()
        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "overwritten runnable sample working!");
                try {
                    otherThread.join(); //przejdz do otherThread i wykonaj go zanim bedziesz kontynuowal z aktyalnym Runnalbe Sample
                    System.out.println(ANSI_RED + "other thread finished so I work again!");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "overwritten Runnable thread interrupted!");
                }
            }
        } );
        runnableSample.start();
        //otherThread.interrupt(); //przerwanie sleepa w watku otherThread
        //runnableSample.interrupt();

        System.out.println(ANSI_PURPLE + "End of MAIN!");
    }
}