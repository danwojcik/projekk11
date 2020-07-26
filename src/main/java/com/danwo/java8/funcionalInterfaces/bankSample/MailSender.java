package com.danwo.java8.funcionalInterfaces.bankSample;

import java.util.ArrayList;
import java.util.List;

public class MailSender  implements Runnable{
    private String senderName;

    private List<String> adresses;

    public MailSender(String senderName){
        this.senderName = senderName;
        adresses = new ArrayList<>();
    }
    public void addAddress(String adress){
        adresses.add(adress);
    }

    @Override
    public void run() {
        System.out.println("start sending mails");
        for (String address : adresses){
            System.out.println("sending mail to: " + address);
        }
    }
}
