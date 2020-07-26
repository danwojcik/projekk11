package com.danwo.theards.basics;

import static com.danwo.theards.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED +"runnable sample working ");
    }
}
