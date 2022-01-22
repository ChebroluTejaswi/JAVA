package f_Generics;
// ques: Create a generic class to implement a league table for a sport.

import java.util.*;

abstract class Player {
    private String name;
    public Player(String name) { // Constructor
        this.name = name;
    }
    public String getName() { // Getter function (non-abstract function)
        return name;
    }
}


class SoccerPlayer extends Player {
    public SoccerPlayer(String name) {
        super(name); // this will call the constructor in player class
    }
}

class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }
}

class BaseballPlayer extends Player {
    public BaseballPlayer(String name) {
        super(name);
    }
}

// Team class

class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members = new ArrayList<>(); // collection of members

    public Team(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) 
        {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied; // Win: 2 points   Tie: 1    lose: 0 
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}


// League table
class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>(); // collection of teams
    public League(String name) {
        this.name = name;
    }
    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
   }

    public void showLeagueTable() {
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}

public class LeagueTable {
    public static void main(String args[])
    {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();
    }
}
