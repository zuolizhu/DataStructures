package com.zuolizhu.Generics.PlayerExample;

import java.util.ArrayList;

public class Team<T> {

    private String teamName;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(((Player) player).getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(((Player) player).getName() + " is added for team " + this.teamName);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
