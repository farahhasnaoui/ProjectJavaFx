/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author GhAlone
 */
public class MainJavaFX extends Application {

    public static String loggedInID;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root =FXMLLoader.load(getClass().getResource("Sign_in.fxml"));    
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);    
    }  
}
