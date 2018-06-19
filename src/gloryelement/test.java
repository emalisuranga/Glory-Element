/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gloryelement;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sun.applet.Main;

/**
 *
 * @author Emal Isuranga
 */
public class test extends Application{
       private Stage primaryStage;
    private BorderPane mainLayout;
    
    public void start(Stage primaryStage)throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("App");
        showMainView();
        
        
//      Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
//      stage.initStyle(StageStyle.UNDECORATED);
//      
//      Scene scene = new Scene(root);
//      
//      stage.setScene(scene);
//      stage.show();
    }
    
    private void showMainView() throws Exception{
         FXMLLoader loader = new FXMLLoader();
         Object x=Main.class.getResource("MainMenu.fxml");
//         loader.setLocation(new URL());
         mainLayout =loader.load();
         Scene scene = new Scene(mainLayout);
         primaryStage.setScene(scene);
         primaryStage.show();
         
    }

   
    public static void main(String[] args) {
     launch(args);
    }
}
