package com.danwo.theards.notifier;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();

        (new Thread(new Writer(message))).start(); //anonimowe wywowolanie watku

        //rownowazne z powyzsza linijka ale tutaj mozna sie pozniej odwolac do obiektu - jawne wywowalenie watku
        Thread readerThread = new Thread(new Reader(message));
        readerThread.start();
    }
}
