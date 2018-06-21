/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gloryelement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sun.applet.Main;
import java.sql.*;
import java.util.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

public class GloryELement extends Application{
    private double xOffset = 0;
    private double yOffset = 0;
    
    public void start(Stage stage)throws Exception {
   
        
      Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
      stage.initStyle(StageStyle.TRANSPARENT);
      Scene scene = new Scene(root);
      stage.setScene(scene);   

      stage.show();
//      primaryStage.setTitle("Hello");
//      primaryStage.setScene(new Scene(root));
//      primaryStage.show();
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        xOffset = event.getSceneX();
                        yOffset = event.getSceneY();
                    }
                });
        
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

    }
//    void connnection(){
//      try{
//          // class.forName("com.mysql.jdbc.Driver");
//       Connection myConn = DriverManager.getConnection("jdbc:mysql://glorydbase.czf6425elolu.ap-south-1.rds.amazonaws.com:3306/DBGlory","glory","glory123");
//       Statement myStmt = myConn.createStatement();
//       ResultSet myrs = myStmt.executeQuery("select * from MasterPool ORDER BY player_hscore DESC");
//       while(myrs.next()){
//       System.out.println(myrs.getString("player_name"));
//       }}
//       catch(Exception exc){
//       exc.printStackTrace();
//       }
//    }

    public static void main(String[] args){
        // TODO code application logic here
        
      launch(args);
//         GloryELement gr = new GloryELement();
//         gr.connnection();
     
     
     
//        
    }
    
}
