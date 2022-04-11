package com.parker.risk.logic.cards;

import com.parker.risk.logic.Territory;
import com.parker.risk.logic.pieces.Piece;

public class TerritoryCard extends Card{

    private Territory territory;
    private Piece piece;

    public TerritoryCard(Territory territory, Piece piece) {
        this.territory = territory;
        this.piece = piece;
    }
}
