/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;

import javafx.animation.Timeline;
import javafx.scene.control.Button;
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
public class MainMenu extends Pane {

 
    private Button singleplayerButton;
    private Button multiplayerButton;
    private Button optionsButton;
    private Button creditsButton;
    private Button exitButton;

    
    private double width, height;
   

    public MainMenu() {
        
        width = 1024;
        height = 660;

        singleplayerButton = new Button("Singleplayer");
        singleplayerButton.getStyleClass().add("menuButton");
        singleplayerButton.setMinSize(200, 50);
        singleplayerButton.setLayoutX(height/2 + 200/2);
        singleplayerButton.setLayoutY(width/5 + 10);

        multiplayerButton = new Button("Multiplayer");
        multiplayerButton.getStyleClass().add("menuButton");
        multiplayerButton.setMinSize(200, 50);
        multiplayerButton.setLayoutX(height/2 + 200/2);
        multiplayerButton.setLayoutY(width/5 + 85);

        optionsButton = new Button("Options");
        optionsButton.getStyleClass().add("menuButton");
        optionsButton.setMinSize(200, 50);
        optionsButton.setLayoutX(height/2 + 200/2);
        optionsButton.setLayoutY(width/5 + 160);
        
        creditsButton = new Button("Credits");
        creditsButton.getStyleClass().add("menuButton");
         creditsButton.setMinSize(200, 50);
        creditsButton.setLayoutX(height/2 + 200/2);
        creditsButton.setLayoutY(width/5 + 235);
        
         exitButton = new Button("Exit");
        exitButton.getStyleClass().add("menuButton");
         exitButton.setMinSize(200, 50);
        exitButton.setLayoutX(height/2 + 200/2);
        exitButton.setLayoutY(width/5 + 310);
        
       

         this.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/bg.png"), 
                 width, width, true, true), BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        
        
        getChildren().addAll( singleplayerButton, multiplayerButton, optionsButton, creditsButton, exitButton);
    }

    public Button getSingleplayerButton() {
        return singleplayerButton;
    }

    public void setSingleplayerButton(Button singleplayerButton) {
        this.singleplayerButton = singleplayerButton;
    }

    public Button getMultiplayerButton() {
        return multiplayerButton;
    }

    public void setMultiplayerButton(Button multiplayerButton) {
        this.multiplayerButton = multiplayerButton;
    }

    public Button getOptionsButton() {
        return optionsButton;
    }

    public void setOptionsButton(Button optionsButton) {
        this.optionsButton = optionsButton;
    }

    public Button getCreditsButton() {
        return creditsButton;
    }

    public void setCreditsButton(Button creditsButton) {
        this.creditsButton = creditsButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }

     


}
