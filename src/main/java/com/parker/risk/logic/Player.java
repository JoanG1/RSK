package com.parker.risk.logic;

import com.parker.risk.logic.cards.Card;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;
    private ArmyColor color;

    public Player(String name, ArmyColor color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public ArmyColor getColor() {
        return color;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }
}
