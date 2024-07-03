package org.amit2.topics.designPattern.structural.adapter;

public class Test {
    public static void main( String[] args){
        Player player = new DhoniAdapter(new MsDhoni());
        System.out.println(player.run());
        Player player2 = new RishabAdapter(new RishabPant());
        System.out.println(player2.run());
    }
}
