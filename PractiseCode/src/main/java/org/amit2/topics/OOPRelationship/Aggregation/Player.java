package org.amit2.topics.OOPRelationship.Aggregation;


import java.util.ArrayList;
import java.util.List;

/*
 *
 * Aggregation represents an "has-a" relationship between a
 * two classes.
 * but here the part can  live independently
 * like player can live independently
 *
 * . All aggregations are associations
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
