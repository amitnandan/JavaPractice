package org.amit2.topics.OOPRelationship.Association;


import java.util.ArrayList;
import java.util.List;

/*
 *
 * Association represents an "has-a" relationship between a
 * two classes.
 * two type : bidirectional and unidirectional
 * unidirectional = team has a player
 * bidirectional = A Person has address and address has list of person
 * */


public class Player {
    void plays(){
        System.out.println("PLAYS");
    }
}


class Team  {
    List<Player> playerList;
    public Team() {
        playerList = new ArrayList<>();
    }

}

class Test{

    public static void main(String[] args){

        Team t = new Team();
        t.playerList.add(new Player());
        t.playerList.get(0).plays();

    }

}
