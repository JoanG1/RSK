package com.parker.risk.logic;

import com.parker.risk.logic.pieces.Artillery;
import com.parker.risk.logic.pieces.Cavalry;
import com.parker.risk.logic.pieces.Infantry;
import com.parker.risk.logic.pieces.Piece;

public enum Territories {

    AFGHANISTAN(1, "Afghanistan", TerritoryGroup.ASIA, new Cavalry()),
    ALASKA(1, "Alaska", TerritoryGroup.NORTH_AMERICA, new Infantry()),
    ALBERTA(2, "Alberta", TerritoryGroup.NORTH_AMERICA, new Cavalry()),
    ARGENTINA(1, "Argentina", TerritoryGroup.SOUTH_AMERICA, new Infantry()),
    BRAZIL(2, "Brazil", TerritoryGroup.SOUTH_AMERICA, new Artillery()),
    CENTRAL_AFRICA(1, "Central Africa", TerritoryGroup.AFRICA, new Infantry()),
    CENTRAL_AMERICA(3, "Central America", TerritoryGroup.NORTH_AMERICA, new Artillery()),
    CHINA(2, "China", TerritoryGroup.ASIA, new Infantry()),
    EAST_AFRICA(2, "East Africa", TerritoryGroup.AFRICA, new Infantry()),
    EASTERN_AUSTRALIA(1, "Eastern Australia", TerritoryGroup.AUSTRALIA, new Artillery()),
    EASTERN_CANADA(8, "Eastern Canada / Ontario", TerritoryGroup.NORTH_AMERICA, new Cavalry()),
    EASTERN_UNITED_STATES(4, "Eastern United States", TerritoryGroup.NORTH_AMERICA, new Artillery()),
    EGYPT(3, "Egypt", TerritoryGroup.AFRICA, new Infantry()),
    GREAT_BRITAIN(1, "Great Britain", TerritoryGroup.EUROPE, new Artillery()),
    GREENLAND(5, "Greenland", TerritoryGroup.NORTH_AMERICA, new Cavalry()),
    ICELAND(2, "Iceland", TerritoryGroup.EUROPE, new Infantry()),
    INDIA(3, "India", TerritoryGroup.ASIA, new Cavalry()),
    INDONESIA(2, "Indonesia", TerritoryGroup.AUSTRALIA, new Artillery()),
    IRKUTSK(4, "Irkutsk", TerritoryGroup.ASIA, new Cavalry()),
    JAPAN(5, "Japan", TerritoryGroup.ASIA, new Artillery()),
    KAMCHATKA(6, "Kamchatka", TerritoryGroup.ASIA, new Infantry()),
    MADAGASCAR(4, "Madagascar", TerritoryGroup.AFRICA, new Cavalry()),
    MIDDLE_EAST(7, "Middle East", TerritoryGroup.ASIA, new Infantry()),
    MONGOLIA(8, "Mongolia", TerritoryGroup.ASIA, new Infantry()),
    NEW_GUINEA(3, "New Guinea", TerritoryGroup.AUSTRALIA, new Infantry()),
    NORTH_AFRICA(5, "North Africa", TerritoryGroup.AFRICA, new Cavalry()),
    NORTHERN_EUROPE(3, "Northern Europe", TerritoryGroup.EUROPE, new Artillery()),
    NORTHWEST_TERRITORY(6, "Northwest Territory", TerritoryGroup.NORTH_AMERICA, new Artillery()),
    ONTARIO(7, "Ontario", TerritoryGroup.NORTH_AMERICA, new Cavalry()),
    PERU(3, "Peru", TerritoryGroup.SOUTH_AMERICA, new Infantry()),
    RUSSIA(6, "Russia / Ukraine", TerritoryGroup.EUROPE, new Cavalry()),
    SCANDINAVIA(4, "Scandinavia", TerritoryGroup.EUROPE, new Cavalry()),
    SIBERIA(10, "Siberia", TerritoryGroup.ASIA, new Cavalry()),
    SOUTH_AFRICA(6, "South Africa", TerritoryGroup.AFRICA, new Artillery()),
    SOUTHEAST_ASIA(9, "Southeast Asia / Siam", TerritoryGroup.ASIA, new Infantry()),
    SOUTHERN_EUROPE(5, "Southern Europe", TerritoryGroup.EUROPE, new Artillery()),
    URAL(11, "Ural", TerritoryGroup.ASIA, new Cavalry()),
    VENEZUELA(4, "Venezuela", TerritoryGroup.SOUTH_AMERICA, new Infantry()),
    WESTERN_AUSTRALIA(4, "Western Australia", TerritoryGroup.AUSTRALIA, new Artillery()),
    WESTERN_EUROPE(7, "Western Europe", TerritoryGroup.EUROPE, new Artillery()),
    WESTERN_UNITED_STATES(9, "Western United States", TerritoryGroup.NORTH_AMERICA, new Artillery()),
    YAKUTSK(12, "Yakutsk", TerritoryGroup.ASIA, new Cavalry());

    private int id;
    private String name;
    private TerritoryGroup group;
    private Piece piece;

    Territories(int id, String name, TerritoryGroup group, Piece piece) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.piece = piece;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public TerritoryGroup getGroup() {
        return group;
    }

    public Piece getPiece() {
        return piece;
    }
}
