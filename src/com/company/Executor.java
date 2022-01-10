package com.company;

import games.Football;
import games.Games;
import games.RunGames;
import stadium.Stadium;

public class Executor {
    public static void main(String[] args) {
        Football football1 = new Football("One");
        Football football3 = new Football("Two");
        Stadium stadium = new Stadium();

        stadium.setListFootball(football1);
        stadium.setListFootball1(football3);

        for (Football football : stadium.getListFootball()) {
            System.out.println(football.getName());
        }

        Games football = new Football("OneFootballGame");
        Games football2 = new Football("TwoFootballGame");

        stadium.setListFootball(football3);
        stadium.setListFootball(football1);
        stadium.printListGames();

        Stadium stadium1 = new Stadium();
        System.out.println("Stadium: Real");
//        System.out.println(stadium.getStadium().printInfoStadium());
    }
}


