package com.danwo.generics;

//enum czyli typ wyliczeniowy
//ze scisle okreslona, predefiniowana lista wartosci
//dodanie kolejnej wartosci mozliwe tylko wewnatrz enum, nie ma mozliwosci dorobienia przez new()

public enum TeamLevel {
    AMATEUR("stadion", 200, "A"),
    PROFESSIONAL("arena", 20000, "P");

    private  String place;
    private int fans;
    private String abberviation;

    TeamLevel(String place, int fans, String abberviation) {
        this.place = place;
        this.fans = fans;
        this.abberviation = abberviation;
    }

    public String getPlace() {
        return place;
    }

    public int getFans() {
        return fans;
    }

    public String getAbberviation() {
        return abberviation;
    }
    public static TeamLevel getByAbberviation(String abberv){
        //petla po wszystkich elementach enuma
        for (TeamLevel level : TeamLevel.values()) {
            //dla kazdego elementu wyciagamy pole abbreviation i porownujemy z otrzymanym parametrem abbrev
            if (abberv.equalsIgnoreCase(level.abberviation)){
                //jak znajdzie pasujacy to zwracamy ten element enuma
                return level;
            }
        }
        return null;
    }
}

