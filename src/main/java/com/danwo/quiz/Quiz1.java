package com.danwo.quiz;

public class Quiz1 {
    public static void main(String[] args) {
        String teks = "Pan Tadeusz";
        while (teks.charAt(4) == 'T'){
            System.out.print("A");
            if(teks.length() > 3) {
                System.out.print("B");
                break;
            }else {
                System.out.print("C");
                break;
            }
        }
        System.out.print("D");
    }
}