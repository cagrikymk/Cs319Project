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
public class CreditsView extends Pane {

 
    private Button backButton;
    
    private Label groupMembersLabel;          

    
    private double width, height;
   

    public CreditsView() {
        
        width = 1366;
        height = 768;

        
         backButton = new Button("Back");
        backButton.getStyleClass().add("menuButton");
         backButton.setMinSize(200, 50);
        backButton.setLayoutX(width - 250);
        backButton.setLayoutY(height - 100);
        
        groupMembersLabel = new Label();
        groupMembersLabel.setText("Mehmet Çağrı Kaymak\nAbdullah Alperen\nMehmet Fatih Çağıl\nDoğukan Ömer Gür");
        groupMembersLabel.setLayoutX(width/2 - 200);
        groupMembersLabel.setLayoutY(height/3);
        groupMembersLabel.getStyleClass().add("creditsLabel");
        
       

         this.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/emptybg.png"), 
                 width, height, true, true), BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        
        
        getChildren().addAll(backButton, groupMembersLabel);
    }

    public Button getBackButton() {
        return backButton;
    }

    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }

   

     


}
