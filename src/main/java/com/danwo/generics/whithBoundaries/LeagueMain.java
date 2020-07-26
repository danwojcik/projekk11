package com.danwo.generics.whithBoundaries;

import com.danwo.generics.FootballTeam;
import com.danwo.generics.Team;
import com.danwo.generics.TeamLevel;
import com.danwo.generics.VolleyballTeam;

public class LeagueMain {
    public static void main(String[] args) {
        League<FootballTeam> league = new League("Primiera Division");
        League<VolleyballTeam> volleyLegue = new League<>("Plus Liga");

        FootballTeam team1 = new FootballTeam("FC Barcelona", TeamLevel.PROFESSIONAL);
        FootballTeam team2 = new FootballTeam("Real Madrid", TeamLevel.PROFESSIONAL);
        FootballTeam team3 = new FootballTeam("Valencia CF", TeamLevel.PROFESSIONAL);
        FootballTeam team4 = new FootballTeam("Atletico Madrid", TeamLevel.PROFESSIONAL);
        team1.setPoints(30);
        team2.setPoints(10);
        team3.setPoints(20);
        team4.setPoints(28);
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.addTeam(team4);
        league.printTable();

        Team team5 = new VolleyballTeam("Asseco Resovia", TeamLevel.PROFESSIONAL);
        team5.setPoints(18);
        //league.addTeam((FootballTeam) team5);
        System.out.println("========");
        volleyLegue.addTeam((VolleyballTeam) team5);
        volleyLegue.printTable();
    }
}
