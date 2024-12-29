package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class sampleViewControler {
    public Label lblTextHello;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        System.out.println("Hello Bn");

        lblTextHello.setText("Hello Man awa");

    }


}
