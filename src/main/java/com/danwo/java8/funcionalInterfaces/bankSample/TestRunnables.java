package com.danwo.java8.funcionalInterfaces.bankSample;

import java.util.LinkedList;
import java.util.List;

public class TestRunnables {
    public static void main(String[] args) {

        Runnable mailSender = new MailSender("PREZES");
        Runnable reportGen = new RaportGenerator ("OUTSOURCE COMPANY");
        Runnable counter = new InterestCounter("standard interest counter");

        //rzutowanie
        ((MailSender) mailSender).addAddress("księgowy");
        ((MailSender) mailSender).addAddress("informatyk");
        ((MailSender) mailSender).addAddress("recepcja");
        ((MailSender) mailSender).addAddress("administracja");

        List<Runnable> runnables = new LinkedList<>();
        runnables.add(mailSender);
        runnables.add(reportGen);
        runnables.add(counter);

        for (Runnable runnable : runnables){
            Thread thread = new Thread(runnable);
            thread.start();
        }

    }
}
