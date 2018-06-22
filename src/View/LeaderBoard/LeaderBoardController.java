/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.LeaderBoard;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Emal Isuranga
 */
public class LeaderBoardController implements Initializable {
    
    private PreparedStatement pst= null;
    private ResultSet rs = null;
    ObservableList<MdelTable> oblist = FXCollections.observableArrayList();
    
    int rank = 1;
    @FXML
    private TableView<MdelTable> table;
    @FXML
    private TableColumn<MdelTable, String> col_rank;
    @FXML
    private TableColumn<MdelTable, String> col_ply;
    @FXML
    private TableColumn<MdelTable, String> col_scor;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     
        
        setCellTable();
       loadDataFromDB();
    } 
    
    private void setCellTable(){
        col_rank.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_ply.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_scor.setCellValueFactory(new PropertyValueFactory<>("scor"));
        table.setItems(oblist);
    }
    
    private void loadDataFromDB(){
             try{
           //class.forName("com.mysql.jdbc.Driver");
       Connection myConn = DriverManager.getConnection("jdbc:mysql://glorydbase.czf6425elolu.ap-south-1.rds.amazonaws.com:3306/DBGlory","glory","glory123");
       Statement myStmt = myConn.createStatement();
       rs = myStmt.executeQuery("select * from MasterPool ORDER BY player_hscore DESC");
       while(rs.next()){
       oblist.add(new MdelTable(rs.getString("player_name"), rs.getString("player_hscore")));
       
           System.out.println(oblist);
        rank = rank+1; 
       }}
       catch(Exception exc){
       exc.printStackTrace();
       }
         }

    
}
