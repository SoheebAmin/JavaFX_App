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

public class secondSceneController implements Initializable{

    @FXML private Label theSecondLabel;

    public void clickMeClicked(){
        theSecondLabel.setText("Label after Clicked");
    }

    public void changeToEntryScene(ActionEvent event) throws IOException {
            Parent entrySceneParent = FXMLLoader.load(getClass().getResource(("entryScene.fxml")));
            Scene entrySceneScene = new Scene(entrySceneParent);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();   // need this to get the stage info
            window.setScene(entrySceneScene);
            window.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}



