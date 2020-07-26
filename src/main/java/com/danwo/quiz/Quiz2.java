package com.danwo.quiz;

public class Quiz2 {
    public static void main(String[] args) {
        int wynik = 3 + 3 * 3;
        while (wynik > 0){
            if (wynik%9 == 0){
                System.out.print('+');
                break;
            }
            wynik--;
            if (wynik%2 == 1){
                continue;
            }
            System.out.print('-');
        }
    }
}
