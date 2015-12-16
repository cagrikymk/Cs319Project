/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameFieldManager;
import controller.GameManager;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import model.GameField;

/**
 *
 * @author cagrikaymak
 */
public class GameRendererPane extends Pane {
    private GameManager gameManager;
    private GameFieldManager gameFieldManager;
    private GameField gameField;
    private ImageView gameBackgroundImage;
    public GameRendererPane() {
        gameManager = GameManager.getInstance();
        gameFieldManager = gameManager.getGameFieldManager();
        gameField = gameFieldManager.getGameField();
        // drawing game background
        gameBackgroundImage = new ImageView(new Image(getClass().getResourceAsStream(gameField.getImageURL()), 
                gameField.getActiveField().getWidth(), gameField.getActiveField().getHeight(), false, true));
        gameBackgroundImage.setLayoutX(gameField.getActiveField().getX());
        gameBackgroundImage.setLayoutY(gameField.getActiveField().getY());
        
        getChildren().addAll(gameBackgroundImage);
        
        getChildren().addAll(gameField.getBall().getShape());
    }
    
    
    
    
}