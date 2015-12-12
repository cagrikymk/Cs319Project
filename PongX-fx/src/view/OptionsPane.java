/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.extraComponents.ToggleSwitch;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.Options;

/**
 *
 * @author AhmetAy
 */
public class OptionsPane extends Pane {

 
    private Button backButton, changeBackgroundButton, saveButton;
    private Button changeMoveUp1Button, changeMoveUp2Button;
     private Button changeMoveDown1Button, changeMoveDown2Button;
     
    private Label enableSoundLabel;
    private ToggleSwitch soundSwitch;
    private Label  p1Label, moveUp1Label, moveDown1Label;          
    private Label  p2Label, moveUp2Label, moveDown2Label; 
    
    private Label optionsHeaderTitle;
    
    private double width, height;
   
    private Options options;
    
    public OptionsPane() {
        
        options = new Options();
        
        width = 1366;
        height = 768;
        
        optionsHeaderTitle = new Label("Options");
        optionsHeaderTitle.getStyleClass().add("paneHeaderLabel");
        optionsHeaderTitle.setLayoutY(height/20);
        optionsHeaderTitle.setLayoutX(width/5);

         backButton = new Button("Back");
        backButton.getStyleClass().add("menuButton");
         backButton.setMinSize(200, 50);
        backButton.setLayoutX(width - 500);
        backButton.setLayoutY(height - 100);
        
         saveButton = new Button("Apply");
        saveButton.getStyleClass().add("menuButton");
         saveButton.setMinSize(200, 50);
        saveButton.setLayoutX(width - 250);
        saveButton.setLayoutY(height - 100);
        
        changeBackgroundButton = new Button("Change Game Background");
         changeBackgroundButton.getStyleClass().add("buttonBlue");
        enableSoundLabel = new Label("Enable Sounds");
        enableSoundLabel.getStyleClass().add("font");  
        soundSwitch = new ToggleSwitch();
        soundSwitch.setSelection(options.isIsSoundEnabled());
        
        
        
        soundSwitch.setLayoutX(100);
        soundSwitch.setLayoutY(height/3);
        
        p1Label = new Label("           P1");
        p1Label.getStyleClass().add("font");
        p1Label.setAlignment(Pos.CENTER);
        p2Label = new Label("           P2");        
        p2Label.getStyleClass().add("font");
          p2Label.setAlignment(Pos.CENTER);
       
        moveUp1Label = new Label("MOVE UP       ");
        moveUp1Label.getStyleClass().add("font");
        moveDown1Label = new Label("MOVE DOWN ");
         moveDown1Label.getStyleClass().add("font");
         
         changeMoveUp1Button = new Button(options.getP1Keys()[0].toUpperCase());
         
         changeMoveDown1Button = new Button(options.getP1Keys()[1].toUpperCase());
         changeMoveUp1Button.getStyleClass().add("buttonBlue");
         changeMoveDown1Button.getStyleClass().add("buttonBlue");
         
         changeMoveUp2Button = new Button(options.getP2Keys()[0].toUpperCase());
         changeMoveDown2Button = new Button(options.getP2Keys()[1].toUpperCase());
         changeMoveUp2Button.getStyleClass().add("buttonBlue");
         changeMoveDown2Button.getStyleClass().add("buttonBlue");
         
         moveUp2Label = new Label("MOVE UP       ");
        moveUp2Label.getStyleClass().add("font");
        moveDown2Label = new Label("MOVE DOWN ");
         moveDown2Label.getStyleClass().add("font");
        // will hold left side of options menu
        HBox soundBox = new HBox(enableSoundLabel, soundSwitch);
        soundBox.setSpacing(20);
        VBox leftBox = new VBox(soundBox, changeBackgroundButton);
        leftBox.setSpacing(35);
        leftBox.setLayoutX(width/5);
        leftBox.setLayoutY(height*2/7);
        
        // right side of options menu    
        HBox p1MoveUpBox = new HBox(moveUp1Label, changeMoveUp1Button);
        HBox p1MoveDownBox = new HBox(moveDown1Label, changeMoveDown1Button);
        HBox p2MoveUpBox = new HBox(moveUp2Label, changeMoveUp2Button);
        HBox p2MoveDownBox = new HBox(moveDown2Label, changeMoveDown2Button);
        soundBox.setSpacing(20);
        VBox rightBox1 = new VBox(p1Label, p1MoveUpBox, p1MoveDownBox);
        rightBox1.getStyleClass().add("vBoxOptions");
        
        
        VBox rightBox2 = new VBox(p2Label, p2MoveUpBox, p2MoveDownBox);        
        rightBox2.getStyleClass().add("vBoxOptions");
        
        VBox rightBox = new VBox(rightBox1, rightBox2);
        rightBox.setLayoutX(width*3/5);
        rightBox.setLayoutY(height*2/7);  
        rightBox.setSpacing(35);
        
         this.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/emptybg.png"), 
                 width, height, true, true), BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        
        
        getChildren().addAll(optionsHeaderTitle,backButton,saveButton, leftBox, rightBox);
    }

    public Button getBackButton() {
        return backButton;
    }

    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }

    public Button getChangeBackgroundButton() {
        return changeBackgroundButton;
    }

    public void setChangeBackgroundButton(Button changeBackgroundButton) {
        this.changeBackgroundButton = changeBackgroundButton;
    }

    public Button getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(Button saveButton) {
        this.saveButton = saveButton;
    }

    public ToggleSwitch getSoundSwitch() {
        return soundSwitch;
    }

    public void setSoundSwitch(ToggleSwitch soundSwitch) {
        this.soundSwitch = soundSwitch;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }
    
    
    
    
    
    

   

     


}
