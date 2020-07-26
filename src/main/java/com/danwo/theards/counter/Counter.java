package com.danwo.theards.counter;

import static com.danwo.theards.ThreadColor.*;

public class Counter {
    private int i;
    public void performCountdown(){
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread1":
                color = ANSI_CYAN;
                break;
            case "Thread2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_BLUE;
        }
        //kod otoczony synchronized ma sie wykonac w calosci dla danego watku bez mozliwosci przerwania wykonania przez inny watek
        //analogicznie dla metody zdeklarowanej jako synchrnized: private synchronized void doRealCounting
        //synchronized (this) {
            doRealCounting(color);
        //}
    }

    private synchronized void doRealCounting(String color) {
        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + "i = " + i);
        }
    }
}
