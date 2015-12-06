/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;

import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

/**
 *
 * @author AhmetAy
 */
public class OptionsView extends Pane {

 
    private Button backButton;
    
    private Label enableSoundLabel, changeBackgroundLabel; ;
    private Label  p1Label, moveUp1Label, moveDown1Label;          
    private Label  p2Label, moveUp2Label, moveDown2Label; 
    
    private double width, height;
   

    public OptionsView() {
        
        width = 1366;
        height = 768;

         backButton = new Button("Back");
        backButton.getStyleClass().add("menuButton");
         backButton.setMinSize(200, 50);
        backButton.setLayoutX(width - 250);
        backButton.setLayoutY(height - 100);
         
        
       

         this.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/emptybg.png"), 
                 width, height, true, true), BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        
        
        getChildren().addAll(backButton);
    }

    public Button getBackButton() {
        return backButton;
    }

    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }

   

     


}
