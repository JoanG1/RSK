package com.parker.risk.logic;

import com.parker.risk.logic.cards.Card;
import com.parker.risk.logic.cards.TerritoryCard;

import java.util.ArrayList;
import java.util.EnumSet;

public class Board {

    private ArrayList<Territory> territories;
    private ArrayList<Card> cards;
    private ArrayList<Army> armies;

    public Board() {
        init();
    }

    private void init() {
        territories = new ArrayList<>();

        ArrayList<Territories> territoryEnumList = new ArrayList<>(EnumSet.allOf(Territories.class));

        // Territories - https://upload.wikimedia.org/wikipedia/commons/5/5d/Risk_game_board.svg
        for (Territories territory: territoryEnumList) {
            territories.add(new Territory(territory.getId(), territory.getName(), territory.getGroup()));
        }

        // Borders - https://upload.wikimedia.org/wikipedia/commons/7/78/Risk_game_graph.svg

        // NORTH AMERICA
        getTerritory(1, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(6, TerritoryGroup.NORTH_AMERICA));
        getTerritory(6, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(5, TerritoryGroup.NORTH_AMERICA));
        getTerritory(2, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(7, TerritoryGroup.NORTH_AMERICA));
        getTerritory(7, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(8, TerritoryGroup.NORTH_AMERICA));
        getTerritory(8, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(4, TerritoryGroup.NORTH_AMERICA));

        getTerritory(1, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(2, TerritoryGroup.NORTH_AMERICA));
        getTerritory(2, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(9, TerritoryGroup.NORTH_AMERICA));
        getTerritory(9, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(3, TerritoryGroup.NORTH_AMERICA));
        getTerritory(6, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(7, TerritoryGroup.NORTH_AMERICA));
        getTerritory(7, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(4, TerritoryGroup.NORTH_AMERICA));
        getTerritory(5, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(8, TerritoryGroup.NORTH_AMERICA));

        getTerritory(2, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(6, TerritoryGroup.NORTH_AMERICA));
        getTerritory(9, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(7, TerritoryGroup.NORTH_AMERICA));
        getTerritory(7, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(5, TerritoryGroup.NORTH_AMERICA));
        getTerritory(3, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(4, TerritoryGroup.NORTH_AMERICA));
        getTerritory(4, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(8, TerritoryGroup.NORTH_AMERICA));

        // SOUTH AMERICA
        getTerritory(4, TerritoryGroup.SOUTH_AMERICA).addBorder(getTerritory(2, TerritoryGroup.SOUTH_AMERICA));
        getTerritory(3, TerritoryGroup.SOUTH_AMERICA).addBorder(getTerritory(1, TerritoryGroup.SOUTH_AMERICA));
        getTerritory(4, TerritoryGroup.SOUTH_AMERICA).addBorder(getTerritory(3, TerritoryGroup.SOUTH_AMERICA));
        getTerritory(2, TerritoryGroup.SOUTH_AMERICA).addBorder(getTerritory(1, TerritoryGroup.SOUTH_AMERICA));
        getTerritory(2, TerritoryGroup.SOUTH_AMERICA).addBorder(getTerritory(3, TerritoryGroup.SOUTH_AMERICA));

        // EUROPE
        getTerritory(2, TerritoryGroup.EUROPE).addBorder(getTerritory(4, TerritoryGroup.EUROPE));
        getTerritory(1, TerritoryGroup.EUROPE).addBorder(getTerritory(3, TerritoryGroup.EUROPE));
        getTerritory(3, TerritoryGroup.EUROPE).addBorder(getTerritory(6, TerritoryGroup.EUROPE));
        getTerritory(7, TerritoryGroup.EUROPE).addBorder(getTerritory(5, TerritoryGroup.EUROPE));
        getTerritory(2, TerritoryGroup.EUROPE).addBorder(getTerritory(1, TerritoryGroup.EUROPE));
        getTerritory(4, TerritoryGroup.EUROPE).addBorder(getTerritory(3, TerritoryGroup.EUROPE));
        getTerritory(3, TerritoryGroup.EUROPE).addBorder(getTerritory(7, TerritoryGroup.EUROPE));
        getTerritory(6, TerritoryGroup.EUROPE).addBorder(getTerritory(5, TerritoryGroup.EUROPE));
        getTerritory(1, TerritoryGroup.EUROPE).addBorder(getTerritory(4, TerritoryGroup.EUROPE));
        getTerritory(1, TerritoryGroup.EUROPE).addBorder(getTerritory(7, TerritoryGroup.EUROPE));
        getTerritory(3, TerritoryGroup.EUROPE).addBorder(getTerritory(5, TerritoryGroup.EUROPE));

        // AFRICA
        getTerritory(5, TerritoryGroup.AFRICA).addBorder(getTerritory(3, TerritoryGroup.AFRICA));
        getTerritory(1, TerritoryGroup.AFRICA).addBorder(getTerritory(2, TerritoryGroup.AFRICA));
        getTerritory(6, TerritoryGroup.AFRICA).addBorder(getTerritory(4, TerritoryGroup.AFRICA));
        getTerritory(5, TerritoryGroup.AFRICA).addBorder(getTerritory(1, TerritoryGroup.AFRICA));
        getTerritory(1, TerritoryGroup.AFRICA).addBorder(getTerritory(6, TerritoryGroup.AFRICA));
        getTerritory(3, TerritoryGroup.AFRICA).addBorder(getTerritory(2, TerritoryGroup.AFRICA));
        getTerritory(2, TerritoryGroup.AFRICA).addBorder(getTerritory(4, TerritoryGroup.AFRICA));
        getTerritory(5, TerritoryGroup.AFRICA).addBorder(getTerritory(2, TerritoryGroup.AFRICA));
        getTerritory(2, TerritoryGroup.AFRICA).addBorder(getTerritory(6, TerritoryGroup.AFRICA));

        // ASIA
        getTerritory(11, TerritoryGroup.ASIA).addBorder(getTerritory(10, TerritoryGroup.ASIA));
        getTerritory(10, TerritoryGroup.ASIA).addBorder(getTerritory(4, TerritoryGroup.ASIA));
        getTerritory(4, TerritoryGroup.ASIA).addBorder(getTerritory(6, TerritoryGroup.ASIA));
        getTerritory(1, TerritoryGroup.ASIA).addBorder(getTerritory(2, TerritoryGroup.ASIA));
        getTerritory(2, TerritoryGroup.ASIA).addBorder(getTerritory(8, TerritoryGroup.ASIA));
        getTerritory(8, TerritoryGroup.ASIA).addBorder(getTerritory(5, TerritoryGroup.ASIA));
        getTerritory(7, TerritoryGroup.ASIA).addBorder(getTerritory(3, TerritoryGroup.ASIA));
        getTerritory(3, TerritoryGroup.ASIA).addBorder(getTerritory(9, TerritoryGroup.ASIA));
        getTerritory(11, TerritoryGroup.ASIA).addBorder(getTerritory(10, TerritoryGroup.ASIA));

        getTerritory(11, TerritoryGroup.ASIA).addBorder(getTerritory(1, TerritoryGroup.ASIA));
        getTerritory(1, TerritoryGroup.ASIA).addBorder(getTerritory(7, TerritoryGroup.ASIA));
        getTerritory(10, TerritoryGroup.ASIA).addBorder(getTerritory(2, TerritoryGroup.ASIA));
        getTerritory(2, TerritoryGroup.ASIA).addBorder(getTerritory(3, TerritoryGroup.ASIA));
        getTerritory(12, TerritoryGroup.ASIA).addBorder(getTerritory(4, TerritoryGroup.ASIA));
        getTerritory(4, TerritoryGroup.ASIA).addBorder(getTerritory(8, TerritoryGroup.ASIA));
        getTerritory(6, TerritoryGroup.ASIA).addBorder(getTerritory(5, TerritoryGroup.ASIA));

        getTerritory(1, TerritoryGroup.ASIA).addBorder(getTerritory(3, TerritoryGroup.ASIA));
        getTerritory(11, TerritoryGroup.ASIA).addBorder(getTerritory(2, TerritoryGroup.ASIA));
        getTerritory(2, TerritoryGroup.ASIA).addBorder(getTerritory(9, TerritoryGroup.ASIA));
        getTerritory(10, TerritoryGroup.ASIA).addBorder(getTerritory(8, TerritoryGroup.ASIA));
        getTerritory(12, TerritoryGroup.ASIA).addBorder(getTerritory(6, TerritoryGroup.ASIA));

        getTerritory(10, TerritoryGroup.ASIA).addBorder(getTerritory(12, TerritoryGroup.ASIA));
        getTerritory(8, TerritoryGroup.ASIA).addBorder(getTerritory(6, TerritoryGroup.ASIA));

        // AUSTRALIA
        getTerritory(2, TerritoryGroup.AUSTRALIA).addBorder(getTerritory(3, TerritoryGroup.AUSTRALIA));
        getTerritory(4, TerritoryGroup.AUSTRALIA).addBorder(getTerritory(1, TerritoryGroup.AUSTRALIA));
        getTerritory(2, TerritoryGroup.AUSTRALIA).addBorder(getTerritory(4, TerritoryGroup.AUSTRALIA));
        getTerritory(3, TerritoryGroup.AUSTRALIA).addBorder(getTerritory(1, TerritoryGroup.AUSTRALIA));
        getTerritory(3, TerritoryGroup.AUSTRALIA).addBorder(getTerritory(4, TerritoryGroup.AUSTRALIA));

        // INTER ZONES
        getTerritory(1, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(6, TerritoryGroup.ASIA));
        getTerritory(5, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(2, TerritoryGroup.EUROPE));
        getTerritory(3, TerritoryGroup.NORTH_AMERICA).addBorder(getTerritory(4, TerritoryGroup.SOUTH_AMERICA));
        getTerritory(2, TerritoryGroup.SOUTH_AMERICA).addBorder(getTerritory(5, TerritoryGroup.AFRICA));
        getTerritory(6, TerritoryGroup.EUROPE).addBorder(getTerritory(1, TerritoryGroup.ASIA));
        getTerritory(6, TerritoryGroup.EUROPE).addBorder(getTerritory(7, TerritoryGroup.ASIA));
        getTerritory(6, TerritoryGroup.EUROPE).addBorder(getTerritory(11, TerritoryGroup.ASIA));
        getTerritory(5, TerritoryGroup.EUROPE).addBorder(getTerritory(7, TerritoryGroup.ASIA));
        getTerritory(5, TerritoryGroup.EUROPE).addBorder(getTerritory(3, TerritoryGroup.AFRICA));
        getTerritory(5, TerritoryGroup.EUROPE).addBorder(getTerritory(5, TerritoryGroup.AFRICA));
        getTerritory(7, TerritoryGroup.EUROPE).addBorder(getTerritory(5, TerritoryGroup.AFRICA));
        getTerritory(3, TerritoryGroup.AFRICA).addBorder(getTerritory(7, TerritoryGroup.ASIA));
        getTerritory(2, TerritoryGroup.AFRICA).addBorder(getTerritory(7, TerritoryGroup.ASIA)); // ERRATA
        getTerritory(9, TerritoryGroup.ASIA).addBorder(getTerritory(2, TerritoryGroup.AUSTRALIA));
    }

    public void initCards() {
        cards = new ArrayList<>();
        ArrayList<Territories> territoryEnumList = new ArrayList<>(EnumSet.allOf(Territories.class));

        // Territories - https://upload.wikimedia.org/wikipedia/commons/5/5d/Risk_game_board.svg
        for (Territories territory: territoryEnumList) {
            cards.add(
                new TerritoryCard(
                    new Territory(territory.getId(), territory.getName(), territory.getGroup()),
                    territory.getPiece()
                )
            );
        }
    }

    public Territory getTerritory(int id, TerritoryGroup group) {
        for (Territory territory: territories) {
            if (territory.getId() == id && territory.getTerrytoryGroup().equals(group)) {
                return territory;
            }
        }
        return null;
    }

    public void drawCard(Player player) {
        Card card = cards.get(getRandomNumber(0, cards.size() - 1));
        player.addCard(card);
        cards.remove(card);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
