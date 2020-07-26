package com.danwo.generics.nonGeneric;

import com.danwo.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {
    private String leagueName;
    private List<Team> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>(); //samo inicjowanie obiektu
    }
    public boolean addTeam(Team team){
        if (!teams.contains(team)){
            System.out.println("adding " + team.getName() + " to " + leagueName);
            return teams.add(team);
        }
        System.out.println(team.getName() + " already in " + leagueName);
        return false;
    }

    public void printTable(){
        Collections.sort(teams);
        System.out.println("\n" + leagueName + " table: \n");
        for (Team team : teams) {
            System.out.println(team.getName() + " " + team.getPoints());
        }
    }

}
