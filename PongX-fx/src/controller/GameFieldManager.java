/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Ball;
import model.Brick;
import model.GameField;

/**
 *
 * @author cagrikaymak
 */
public class GameFieldManager {
    private SoundManager soundManager;
    private GameField gameField;
    public final static int MAP_HEIGHT = 100;
    public final static int MAP_WIDTH = 100;
    private String imageURL;
    private boolean isSingleplayer;

    public GameFieldManager(double friction, ArrayList<Brick> brickSet, boolean isSingleplayer, String imageURL) {
        gameField = new GameField(new Ball(20, 0, 0), null, brickSet, friction, imageURL);
        this.imageURL = imageURL;
        this.isSingleplayer = isSingleplayer;
    }

   
    
    
    public boolean generatePower() {
        
        return false;
    }
    
    public void updateGameField() {
        gameField.update();
    }
    
    public void detectBrickBallCollision() {
        
    } 
    
    public void detectStickBallCollision() {
        
    }
    
    public void detectPowerBallCollision() {
        
    }
    
    public void detectBorderCollision() {
        
    }
    
    public void detectGoalAreaCollision() {
        
    }

    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isIsSingleplayer() {
        return isSingleplayer;
    }

    public void setIsSingleplayer(boolean isSingleplayer) {
        this.isSingleplayer = isSingleplayer;
    }
    
    
    
}
