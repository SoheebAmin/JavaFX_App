package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML private Label theLabel;
    @FXML private CheckBox firstbox;
    @FXML private CheckBox secondbox;
    @FXML private CheckBox thirdbox;

    public void runClicked(){
        String checked = "The checkboxes selected are:";

        if (firstbox.isSelected())
            checked += "\nFirst";
        if (secondbox.isSelected())
            checked += "\nSecond";
        if (thirdbox.isSelected())
            checked += "\nThird";

        this.theLabel.setText(checked);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        theLabel.setText(""); //empty, because it the Controller will turn it into text based on what is checked.
    }
}



