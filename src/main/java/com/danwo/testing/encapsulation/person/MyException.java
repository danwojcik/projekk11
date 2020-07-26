package com.danwo.testing.encapsulation.person;

public class MyException extends IllegalAccessException{
    public MyException(String message) {
        super(message);
    }

    public MyException() {
    }
}
