package com.zuolizhu.Generics.PlayerExample;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> newyonkee = new Team<>("newyonkee");
        newyonkee.addPlayer(joe);
//        newyonkee.addPlayer(pat);
//        newyonkee.addPlayer(beckham);

        System.out.println(newyonkee.numPlayers());
    }
}
