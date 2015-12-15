/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javafx.scene.shape.Shape;
import model.Stick;
import model.Power;
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
    
    public void initGameFieldManager() {
        gameField.initializeGameField();
    }

   
    
    
    public boolean generatePower() {
        
        return false;
    }
    
    public void updateGameField() {
        gameField.update();
    }
    
    public void detectBrickBallCollision() {
        for ( Brick b1 : gameField.getBricks()){
            Shape s1 = Shape.intersect(gameField.getBall().getShape(), b1.getShape());
            if ( s1 != null){
                gameField.getBall().reflectBall();
                //b1.update()?
            }
        }
    } 
    
    public void detectStickBallCollision() {
        for ( Stick st1 : gameField.getPlayers()){
            Shape s1 = Shape.intersect(gameField.getBall().getShape(), st1.getShape());
            if ( s1 != null){
                gameField.getBall().reflectBall();
            }
        }
    }
    
    public void detectPowerBallCollision() {
        for ( Power p1 : gameField.getPowers()){
            Shape s1 = Shape.intersect(gameField.getBall().getShape(), p1.getShape());
            if ( s1 != null){
                //Use power on Ball or Stick
               // p1.setVisible(false);
            }
        }
    }
    
    public void detectBorderCollision() {
//        if ( gameField.getBall().getLocation().getY() <= GAMEFIELDUPBORDER)
//              gameField.getBall().reflectBall();
//        if ( gameField.getBall().getLocation().getY() >= GAMEFIELDDOWNBORDER)
//              gameField.getBall().reflectBall();     
    }
    
    public void detectGoalAreaCollision() {
//        if ( gameField.getBall().getLocation().getX() <= GAMEFIELDLEFTBORDER)
//                player2Score += 1;
//        if ( gameField.getBall().getLocation().getX() >= GAMEFIELDRIGHTBORDER)
//                player1Score += 1;
//        
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
