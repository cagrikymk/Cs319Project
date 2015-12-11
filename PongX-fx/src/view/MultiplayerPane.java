/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.extraComponents.NumberSpinner;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;

import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author AhmetAy
 */
public class MultiplayerPane extends Pane {

 
    private Button backButton, playButton, nextMapButton, previousMapButton;
     
    private Label frictionLabel;
    private ComboBox  brickSetComboBox;    
    private NumberSpinner frictionSpinner;
    
    private Label multiPlayerHeaderTitle;
    
    private double width, height;
    
    private ObservableList<String> brickList;
    
    private ImageView gameBackgroundImage;
    private String imageURL[];
    
    private int imageIndex;
    
    private Pane fieldImagePane;
   

    public MultiplayerPane() {
        
        imageURL = new String[3];
        imageURL[0] = "/gameBG1.jpg";
        imageURL[1] = "/gameBG2.jpg";
        imageURL[2] = "/gameBG3.jpg";
        
        width = 1366;
        height = 768;
        
    
        brickList = FXCollections.observableArrayList("Empty brick set", "Brick set 1", "Brick set 2", "Brick set 3");
        
        
        multiPlayerHeaderTitle = new Label("Multiplayer");
        multiPlayerHeaderTitle.getStyleClass().add("paneHeaderLabel");
        multiPlayerHeaderTitle.setLayoutY(height/20);
        multiPlayerHeaderTitle.setLayoutX(width/5);

         backButton = new Button("Back");
        backButton.getStyleClass().add("menuButton");
         backButton.setMinSize(200, 50);
        backButton.setLayoutX(width - 500);
        backButton.setLayoutY(height - 100);
        
         playButton = new Button("PLAY!");
        playButton.getStyleClass().add("menuButton");
         playButton.setMinSize(200, 50);
        playButton.setLayoutX(width - 250);
        playButton.setLayoutY(height - 100);
        
        nextMapButton = new Button("Next->");
         nextMapButton.getStyleClass().add("buttonBlue");
         
         previousMapButton = new Button("<-Prev");
         previousMapButton.getStyleClass().add("buttonBlue");
         
         
        
        
        frictionLabel = new Label("Friction");
        frictionLabel.getStyleClass().add("font");
        
        frictionSpinner = new NumberSpinner(BigDecimal.ONE, BigDecimal.valueOf(0.1));
        frictionSpinner.setMaxWidth(100);
        
        HBox frictionHBox = new HBox(frictionLabel, frictionSpinner);
        frictionHBox.setSpacing(20);
        VBox leftBox = new VBox(frictionHBox);
        leftBox.setSpacing(35);
        leftBox.setLayoutX(width/5);
        leftBox.setLayoutY(height/2 - 140);
        
        // right side of options menu
        
        previousMapButton.setLayoutX(width * 3/5);
        previousMapButton.setLayoutY(height/2 - 90);
        nextMapButton.setLayoutX(width * 3/5 + 400);
        nextMapButton.setLayoutY(height/2 - 90);
        
        gameBackgroundImage = new ImageView(new Image(getClass().getResourceAsStream(imageURL[0]), 280, 140, false, true));
        imageIndex = 0;
        
        fieldImagePane = new Pane();
        fieldImagePane.maxHeight(140);
        fieldImagePane.maxWidth(280);
        //fieldImagePane.setBackground(new Background(new BackgroundImage(gameBackgroundImage, BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        fieldImagePane.setLayoutX(width * 3/5 + 105);
        fieldImagePane.setLayoutY(height/2 - 140);
        fieldImagePane.getChildren().add(gameBackgroundImage);
        
        brickSetComboBox = new ComboBox(brickList);
        brickSetComboBox.setMinWidth(100);
        brickSetComboBox.setLayoutX(width * 3/5 + 175);
        brickSetComboBox.setLayoutY(height/2 + 20);
        brickSetComboBox.setValue(brickList.get(0));
        
        
         this.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/emptybg.png"), 
                 width, height, true, true), BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        
        
        getChildren().addAll(multiPlayerHeaderTitle,backButton,playButton, leftBox, fieldImagePane, previousMapButton, nextMapButton, brickSetComboBox);
    }
    
    public void nextFieldImage() {
        fieldImagePane.getChildren().clear();  
        setImageIndex(imageIndex + 1);
        gameBackgroundImage.setImage(new Image(getClass().getResourceAsStream(imageURL[imageIndex]), 280, 140, false, true));
        fieldImagePane.getChildren().add(gameBackgroundImage);
        
    }
    public void prevFieldImage() {
        fieldImagePane.getChildren().clear();  
        setImageIndex(imageIndex - 1);
        gameBackgroundImage.setImage(new Image(getClass().getResourceAsStream(imageURL[imageIndex]), 280, 140, false, true));
        fieldImagePane.getChildren().add(gameBackgroundImage);
    }
    
    public void setImageIndex(int index) {
        if(index < 0)
            imageIndex = 0;
        else if(index > 2)
            imageIndex = 2;
        else
            imageIndex = index;
    }

    public Button singleplayerPane() {
        return backButton;
    }

    
    public Button getBackButton() {
        return backButton;
    }

    public Button getPlayButton() {
        return playButton;
    }

    public void setPlayButton(Button playButton) {
        this.playButton = playButton;
    }

    public Button getNextMapButton() {
        return nextMapButton;
    }

    public void setNextMapButton(Button nextMapButton) {
        this.nextMapButton = nextMapButton;
    }

    public Button getPreviousMapButton() {
        return previousMapButton;
    }

    public void setPreviousMapButton(Button previousMapButton) {
        this.previousMapButton = previousMapButton;
    }

  

    public ComboBox getBrickSetComboBox() {
        return brickSetComboBox;
    }

    public void setBrickSetComboBox(ComboBox brickSetComboBox) {
        this.brickSetComboBox = brickSetComboBox;
    }

    public NumberSpinner getFrictionSpinner() {
        return frictionSpinner;
    }

    public void setFrictionSpinner(NumberSpinner frictionSpinner) {
        this.frictionSpinner = frictionSpinner;
    }

    public String[] getImageURL() {
        return imageURL;
    }

    public void setImageURL(String[] imageURL) {
        this.imageURL = imageURL;
    }
    
    


    public Pane getFieldImagePane() {
        return fieldImagePane;
    }

    public void setFieldImagePane(Pane fieldImagePane) {
        this.fieldImagePane = fieldImagePane;
    }

    

   

}
