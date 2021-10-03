package com.company;

import java.util.Random;

public class Die {

    private final Random rand = new Random();
    private final int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
    }

    public void rollDice() {
        value = rand.nextInt(6) + 1;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}
