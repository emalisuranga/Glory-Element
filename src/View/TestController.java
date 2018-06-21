/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestController {

 public void loginButtonClicked(){
   System.out.println("User");
   }      
 
  @FXML
    void newPage(ActionEvent event) throws IOException {
        
      Parent root = FXMLLoader.load(getClass().getResource("../View/LeaderBoard.fxml"));
      Stage stage = new Stage();
      stage.setScene(new Scene(root));
      stage.show();
    }
    
@FXML private javafx.scene.control.Button closeButton;

@FXML
 public void closeButtonAction(){
    // get a handle to the stage
    Stage stage = (Stage) closeButton.getScene().getWindow();
    // do what you have to do
    stage.close();
}

}
