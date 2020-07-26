package com.danwo.generics.fullGeneric;

import com.danwo.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T> {
    private String leagueName;
    private List<T> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>(); //samo inicjowanie obiektu
    }
    public boolean addTeam(T team){
        if (!teams.contains(team)){
            System.out.println("adding " + ((Team)team).getName() + " to " + leagueName);
            return teams.add(team);
        }
        System.out.println(((Team)team).getName() + " already in " + leagueName);
        return false;
    }

    public void printTable(){
        Collections.sort((List<Team>)teams);
        System.out.println("\n" + leagueName + " table: \n");
        for (T team : teams) {
            System.out.println(((Team)team).getName() + " " + ((Team)team).getPoints());
        }
    }

}
