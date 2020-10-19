/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 安行行
 */
public class Sample extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
       Label messageLabel = new Label("Hello World"); 
       Label messageLabe2 = new Label("Hello"); 
     
    
       VBox vbox = new VBox(20,messageLabel,messageLabe2);  //创建两个lable 相隔20 竖排
       vbox.setAlignment(Pos.CENTER);              
       Scene scene = new Scene(vbox , 300, 100);
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
