package org.amit2.topics.designPattern.structural.adapter;

public class RishabAdapter implements Player{
    private RishabPant rishabPant ;

    public RishabAdapter(RishabPant rishabPant){
        this.rishabPant = rishabPant;
    }

    @Override
    public int run() {
        return rishabPant.scored();
    }
}
