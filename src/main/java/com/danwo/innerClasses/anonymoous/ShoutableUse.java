package com.danwo.innerClasses.anonymoous;

public class ShoutableUse {
    void shoutOnSomebody() {
        //klasa anomimowa
        Shoutable shoutable = new Shoutable() {
            @Override
            public String shout() {
                return "Yelling at somebody!!";
            }
        };
    }
}
