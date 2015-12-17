/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameManager;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import view.extraComponents.NumberSpinner;

/**
 *
 * @author cagrikaymak
 */
public class PauseMenu extends Pane {
     private Button resumeButton, mainMenuButton;
     
    private Label headerLabel;
   
    public PauseMenu() {
        resumeButton = new Button("Resume");
        resumeButton.getStyleClass().add("menuButton");
        resumeButton.setMinSize(200, 50);
        resumeButton.setLayoutX(GameManager.WIDTH/2 - 200/2);
        resumeButton.setLayoutY(GameManager.HEIGHT/3 + 10);

        mainMenuButton = new Button("Main Menu");
        mainMenuButton.getStyleClass().add("menuButton");
        mainMenuButton.setMinSize(200, 50);
        mainMenuButton.setLayoutX(GameManager.WIDTH/2 - 200/2);
        mainMenuButton.setLayoutY(GameManager.HEIGHT/3 + 85);
        
        this.setPrefSize(300, 600);
        
        this.getChildren().addAll(resumeButton, mainMenuButton);
    }

    public Button getResumeButton() {
        return resumeButton;
    }

    public void setResumeButton(Button resumeButton) {
        this.resumeButton = resumeButton;
    }

    public Button getMainMenuButton() {
        return mainMenuButton;
    }

    public void setMainMenuButton(Button mainMenuButton) {
        this.mainMenuButton = mainMenuButton;
    }
    
    
    
}
