package com.parker.risk.logic;

import java.util.ArrayList;

public class Territory {

    private int id;
    private String name;
    private TerritoryGroup terrytoryGroup;
    private Army army;
    private ArrayList<Territory> borders;

    public Territory(int id, String name, TerritoryGroup terrytoryGroup) {
        this.id = id;
        this.name = name;
        this.terrytoryGroup = terrytoryGroup;
        borders = new ArrayList<>();
    }

    public void addBorder(Territory border) {
        borders.add(border);
        if (!border.getBorders().contains(this)) {
            border.addBorder(this);
        }
    }

    public ArrayList<Territory> getBorders() {
        return borders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TerritoryGroup getTerrytoryGroup() {
        return terrytoryGroup;
    }

    public void setTerrytoryGroup(TerritoryGroup terrytoryGroup) {
        this.terrytoryGroup = terrytoryGroup;
    }
}
