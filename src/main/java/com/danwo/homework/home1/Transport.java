package com.danwo.homework.home1;

public interface Transport {
   default String transportFromTo(String from, String to){
       return "Transport start from " + from + "goes to " + to;
   }
}
