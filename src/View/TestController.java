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
// public TestController(Stage primaryStage) throws IOException{
//      Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
//      primaryStage.setTitle("Hello");
//      primaryStage.setScene(new Scene(root));
//      primaryStage.show();
// }  
 
  @FXML
    void newPage(ActionEvent event) throws IOException {
        
      Parent root = FXMLLoader.load(getClass().getResource("../View/LeaderBoard.fxml"));
      Stage stage = new Stage();
      stage.setScene(new Scene(root));
      stage.show();
    }

}
