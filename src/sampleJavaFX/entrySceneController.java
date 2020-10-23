package sampleJavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class entrySceneController implements Initializable{


    // Elements for the test checkboxes.
    @FXML private Label theLabel;
    @FXML private CheckBox firstbox;
    @FXML private CheckBox secondbox;
    @FXML private CheckBox thirdbox;

    // The button to open a new scene (aka "window")

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

    /* The all important code that actually allows us to change to a different scene! */

    public void changeToSecondScene(ActionEvent event) throws IOException {
        Parent secondSceneParent = FXMLLoader.load(getClass().getResource(("secondScene.fxml")));
        Scene secondSceneScene = new Scene(secondSceneParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();   // need this to get the stage info

        window.setScene(secondSceneScene);
        window.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        theLabel.setText(""); //empty, because it the Controller will turn it into text based on what is checked.
    }
}



