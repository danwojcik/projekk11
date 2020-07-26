package com.danwo.testing.encapsulation.person;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExceptionSample {
    public void sleepThread() throws InterruptedException{
        Thread.sleep(5);
    }

    public void sleepThreadAndReaderFile() throws InterruptedException, FileNotFoundException {
        Thread.sleep(5);
        new FileReader("aaa.abc");
    }

    public void sleepThreadAndReaderFileCommon() throws Exception {
        Thread.sleep(5);
        new FileReader("aaa.abc");
    }


    public void sleepThreadEx1() throws InterruptedException {
        Thread.sleep(5);
    }

    public void sleepThreadEx2() throws FileNotFoundException {
        new FileReader("aaa.abc");
    }
    public void sleepAndRead() throws Exception{
        sleepThreadEx1();
        sleepThreadEx2();

    }
}
