package org.amit2.topics.designPattern.structural.adapter;

public class DhoniAdapter implements Player {

    private MsDhoni msDhoni;

    public DhoniAdapter(MsDhoni msDhoni) {
        this.msDhoni = msDhoni;
    }

    @Override
    public int run() {
        return msDhoni.runs();
    }
}
