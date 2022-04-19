package com.company;

import playerservice.Team;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Team team=new Team();
        ArrayList<Player>  allPlayers=team.getAllPlayer();
//        team.show(allPlayers);
        ArrayList<Player> choiceTeam=team.buildTeam(1,4,4,2);


}

}
