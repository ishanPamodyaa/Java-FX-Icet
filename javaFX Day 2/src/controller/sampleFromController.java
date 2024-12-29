package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sampleFromController {

    @FXML
    private TextField fxId;

    @FXML
    private Label textId;

    @FXML
    void onAction(ActionEvent event) {

       String text =  fxId.getText();
       textId.setText(text);
    }

}
