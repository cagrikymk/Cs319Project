/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameFieldManager;
import controller.GameManager;
import controller.InputManager;
import controller.ScreenManager;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import model.Brick;
import model.GameField;
import model.Power;
import model.Stick;

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
                gameField.getActiveField().getWidth(), gameField.getActiveField().getHeight(), false, false));
        gameBackgroundImage.setLayoutX(gameField.getActiveField().getX());
        gameBackgroundImage.setLayoutY(gameField.getActiveField().getY());
        
        ScreenManager.getScene().addEventHandler(KeyEvent.ANY, gameFieldManager.getInputManager());
        
        getChildren().addAll(gameBackgroundImage);
        
         for(Brick brick: gameField.getBricks()) {
            getChildren().addAll(brick.getShape());
        }
         
         for(Stick stick: gameField.getPlayers()) {
            getChildren().addAll(stick.getShape());
        }
         
         for (Power power: gameField.getPowers()){
             getChildren().addAll(power.getShape());
         }
         
        getChildren().addAll(gameField.getBall().getShape());
    }
    
    
    
    
}
