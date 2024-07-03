package org.amit2.topics.OOPRelationship.Inheritance;

/*
*
* Inheritance represents an "is-a" relationship between a
* superclass and a subclass.
* It is used to achieve polymorphism and code reuse
*
* */


public class Player {
    void play(){};
}


class Bumrah extends Player{

    void bowler(){
        System.out.println("BOWLER");
    }

}

class Test{

    public static void main(String[] args){

        Player p = new Player();
        p.play();
        Player b = new Bumrah();
        b.play();
        Bumrah b2 = new Bumrah();
        b2.bowler();
        b2.play();

    }

}
