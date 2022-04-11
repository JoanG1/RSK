module com.parker.risk {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.parker.risk to javafx.fxml;
    exports com.parker.risk;
    exports com.parker.risk.logic;
    opens com.parker.risk.logic to javafx.fxml;
    exports com.parker.risk.logic.pieces;
    opens com.parker.risk.logic.pieces to javafx.fxml;
    exports com.parker.risk.logic.cards;
    opens com.parker.risk.logic.cards to javafx.fxml;
}