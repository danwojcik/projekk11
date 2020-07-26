package com.danwo.theards.notifier;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;
    private String[] messagesToWrite = {"Linia 1", "Linia 2", "Linia 3"};

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < messagesToWrite.length; i++){
            message.write(messagesToWrite[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("EOF");
    }
}
