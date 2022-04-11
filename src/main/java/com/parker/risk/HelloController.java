package com.parker.risk;

import com.parker.risk.logic.Board;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class HelloController {
    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Pane backgroundPane;

    @FXML
    public void initialize() {
//        System.out.println(HelloApplication.class.getResource("assets/risk_board.svg.png"));
        BackgroundImage myBI= new BackgroundImage(
            new Image(HelloApplication.class.getResource("assets/risk_board.svg.png").toExternalForm(),1024,886,false,true),
            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
            BackgroundSize.DEFAULT
        );
        backgroundPane.setBackground(new Background(myBI));

        Board board = new Board();
    }

}