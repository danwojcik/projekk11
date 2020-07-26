package com.danwo.theards.notifier;

import static com.danwo.theards.ThreadColor.ANSI_BLUE;
import static com.danwo.theards.ThreadColor.ANSI_GREEN;

public class Message {
    private String content;
    private boolean empty;

    public synchronized String read(){
        while (empty){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_GREEN + "blad odczytu");
            }
        }
        System.out.println(ANSI_GREEN + "wiadomosc odczytana wiec moge przkazac kolejna");
        System.out.println(content);
        empty = true;

        notifyAll(); //powiadom wszystkie inne watki ze skoczylen robote
        //notify(); powiadom 1 watek (losowy) ze skonszykem robote
        return content;
    }

    public synchronized void write(String newContent){
        while (!empty){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_BLUE + "blad zapisu");
            }
        }
        System.out.println(ANSI_BLUE + "wiadomosc zapisana wiec moge zapisac nowa");
        System.out.println(ANSI_BLUE + newContent);
        this.content = newContent;
        empty = false;
        notifyAll();
    }
}
