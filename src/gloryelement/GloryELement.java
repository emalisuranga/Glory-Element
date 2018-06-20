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
//import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import javafx.stage.StageStyle;
import sun.applet.Main;
import java.sql.*;
import java.util.*;

public class GloryELement extends Application{
    
    public void start(Stage primaryStage)throws Exception {

        
      Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
      primaryStage.setTitle("Hello");
      primaryStage.setScene(new Scene(root));
      primaryStage.show();

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
