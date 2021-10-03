package com.company;

public class Player {

    private final String name;
    private int scoreCard;
    private Cup cup;

    public Player(String name, int scoreCard) {
        this.name = name;
        this.scoreCard = scoreCard;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public String getName() {
        return name;
    }

    public int getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(int scoreCard) {
        this.scoreCard = scoreCard;
    }
}
