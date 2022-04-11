package com.parker.risk.logic;

import java.util.ArrayList;

public class Board {

    private ArrayList<Territory> territories;
    private ArrayList<Army> armies;

    public Board() {
        init();
    }

    private void init() {
        territories = new ArrayList<>();

        // Territories - https://upload.wikimedia.org/wikipedia/commons/5/5d/Risk_game_board.svg
        territories.add(new Territory(1, "Alaska", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(2, "Alberta (Western Canada)", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(3, "Central America", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(4, "Eastern United States", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(5, "Greenland", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(6, "Northwest Territory", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(7, "Ontario (Central Canada)", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(8, "Quebec (Eastern Canada)", TerritoryGroup.NORTH_AMERICA));
        territories.add(new Territory(9, "Western United States", TerritoryGroup.NORTH_AMERICA));

        territories.add(new Territory(1, "Argentina", TerritoryGroup.SOUTH_AMERICA));
        territories.add(new Territory(2, "Brazil", TerritoryGroup.SOUTH_AMERICA));
        territories.add(new Territory(3, "Peru", TerritoryGroup.SOUTH_AMERICA));
        territories.add(new Territory(4, "Venezuela", TerritoryGroup.SOUTH_AMERICA));

        territories.add(new Territory(1, "Great Britain (Great Britain & Ireland)", TerritoryGroup.EUROPE));
        territories.add(new Territory(2, "Iceland", TerritoryGroup.EUROPE));
        territories.add(new Territory(3, "Northern Europe", TerritoryGroup.EUROPE));
        territories.add(new Territory(4, "Scandinavia", TerritoryGroup.EUROPE));
        territories.add(new Territory(5, "Southern Europe", TerritoryGroup.EUROPE));
        territories.add(new Territory(6, "Ukraine (Eastern Europe, Russia)", TerritoryGroup.EUROPE));
        territories.add(new Territory(7, "Western Europe", TerritoryGroup.EUROPE));

        territories.add(new Territory(1, "Congo (Central Africa)", TerritoryGroup.AFRICA));
        territories.add(new Territory(2, "East Africa", TerritoryGroup.AFRICA));
        territories.add(new Territory(3, "Egypt", TerritoryGroup.AFRICA));
        territories.add(new Territory(4, "Madagascar", TerritoryGroup.AFRICA));
        territories.add(new Territory(5, "North Africa", TerritoryGroup.AFRICA));
        territories.add(new Territory(6, "South Africa", TerritoryGroup.AFRICA));

        territories.add(new Territory(1, "Afghanistan", TerritoryGroup.ASIA));
        territories.add(new Territory(2, "China", TerritoryGroup.ASIA));
        territories.add(new Territory(3, "India (Hindustan)", TerritoryGroup.ASIA));
        territories.add(new Territory(4, "Irkutsk", TerritoryGroup.ASIA));
        territories.add(new Territory(5, "Japan", TerritoryGroup.ASIA));
        territories.add(new Territory(6, "Kamchatka", TerritoryGroup.ASIA));
        territories.add(new Territory(7, "Middle East", TerritoryGroup.ASIA));
        territories.add(new Territory(8, "Mongolia", TerritoryGroup.ASIA));
        territories.add(new Territory(9, "Siam (Southeast Asia)", TerritoryGroup.ASIA));
        territories.add(new Territory(10, "Siberia", TerritoryGroup.ASIA));
        territories.add(new Territory(11, "Ural", TerritoryGroup.ASIA));
        territories.add(new Territory(12, "Yakutsk", TerritoryGroup.ASIA));

        territories.add(new Territory(1, "Eastern Australia", TerritoryGroup.AUSTRALIA));
        territories.add(new Territory(2, "Indonesia", TerritoryGroup.AUSTRALIA));
        territories.add(new Territory(3, "New Guinea", TerritoryGroup.AUSTRALIA));
        territories.add(new Territory(4, "Western Australia", TerritoryGroup.AUSTRALIA));

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

    }

    public Territory getTerritory(int id, TerritoryGroup group) {
        for (Territory territory: territories) {
            if (territory.getId() == id && territory.getTerrytoryGroup().equals(group)) {
                return territory;
            }
        }
        return null;
    }
}
