package com.danwo.theards.basics;

import static com.danwo.theards.ThreadColor.ANSI_BLUE;

public class OtherThread extends Thread {

    @Override
    public void run() {
        super.run();
        //tu dajemy kod do wywolania w osobnym watku
        System.out.println(ANSI_BLUE + "Another thread in action!");
        System.out.println(ANSI_BLUE + currentThread().getName());
        try {
            sleep(6000);
            System.out.println(ANSI_BLUE + "enough sleeping, back to work");
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "I coulndt sleep enough");
        }
    }
}
