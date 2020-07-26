package com.danwo.generics;

public class EnumDemo {
    public static void main(String[] args) {

        FootballTeam footballTeam = new FootballTeam("LA Galaxy", TeamLevel.PROFESSIONAL);

        if (footballTeam.getTeamLevel() == TeamLevel.PROFESSIONAL){
            System.out.println(footballTeam.getName() + " full profeska");
        }
        System.out.println(footballTeam.getName() + " " + provideDescription(footballTeam.getTeamLevel()));

        TeamLevel level = TeamLevel.getByAbberviation("a");
        VolleyballTeam volleyballTeam = new VolleyballTeam("Skra Belchatow", level);
        System.out.println(volleyballTeam.getName() + " " + volleyballTeam.getTeamLevel().getPlace());
    }
    public static String provideDescription(TeamLevel level) {
        switch (level){
            case PROFESSIONAL:
                return "Poziom PRO " + level.getPlace();
            case AMATEUR:
                return "Poziom amatorski " + level.getPlace();
        }
        return "";
    }
}
