/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import model.Stick;
import model.Power;
import model.Ball;
import model.Brick;
import model.GameField;
import model.Options;

/**
 *
 * @author cagrikaymak
 */
public class GameFieldManager {
    private SoundManager soundManager;
    private GameField gameField;
    public final static int MAP_HEIGHT = 600;
    public final static int MAP_WIDTH = 1000;
    private String imageURL;
    private boolean isSingleplayer;
    private int player1Score = 0;
    private int player2Score = 0;
    private InputManager inputManager;

    public GameFieldManager(double friction, ArrayList<Brick> brickSet, boolean isSingleplayer, String imageURL) {
        Stick sticks[] = new Stick[2];
        sticks[0] = new Stick(200, MAP_HEIGHT/2 + 40, new Rectangle(20, 100));
        sticks[1] = new Stick(MAP_WIDTH + 100, MAP_HEIGHT/2 + 40, new Rectangle(20, 100));
        
        gameField = new GameField(new Ball(10, 0, 0), brickSet, sticks, friction, imageURL);
        this.imageURL = imageURL;
        this.isSingleplayer = isSingleplayer;
        inputManager = new InputManager(Options.getInstance().getP1Keys(), Options.getInstance().getP2Keys(), gameField.getPlayers()[0]);
    }
    
    public void initGameFieldManager() {
        gameField.initializeGameField();
    }

   
    
    
    public boolean generatePower() {
        
        return false;
    }
    
    public void updateGameField() {
        detectBorderCollision();
        detectBrickBallCollision();
        detectStickBallCollision();
        gameField.update();
    }
    
   public void detectBrickBallCollision() {
        for ( Brick b1 : gameField.getBricks()){
            Ball ball = gameField.getBall();
            boolean impact = false;
            if (b1.getAxisX() <= ball.getAxisX() && ball.getAxisX() <= b1.getAxisX() + b1.getWidth()){
                if ((b1.getAxisY() + b1.getHeight()) >= (ball.getAxisY() - ball.getRadius()) &&
                        (b1.getAxisY()) <= (ball.getAxisY() - ball.getRadius())){
                    impact = true;
                    ball.reflectBall(Ball.ImpactLocation.TOP);
                }
                else if (b1.getAxisY() <= ball.getAxisY() + ball.getRadius() &&  b1.getAxisY() >= ball.getAxisY() - ball.getRadius()){
                    ball.reflectBall(Ball.ImpactLocation.BOTTOM);
                    impact = true;

                }  
            }
            else if (b1.getAxisY() <= ball.getAxisY() && ball.getAxisY() <= b1.getAxisY() + b1.getHeight() && !impact){
                if (b1.getAxisX() <= ball.getAxisX() - ball.getRadius() && 
                        b1.getAxisX() + b1.getWidth() >= ball.getAxisX() - ball.getRadius()){
                    ball.reflectBall(Ball.ImpactLocation.LEFT);
                }
                else if (b1.getAxisX() + b1.getWidth() >= ball.getAxisX() + ball.getRadius() && 
                        b1.getAxisX() <= ball.getAxisX() + ball.getRadius() ){
                    ball.reflectBall(Ball.ImpactLocation.RIGHT);
                } 
            }
        } 
   }
    
    public void detectStickBallCollision() {
        for ( Stick s1 : gameField.getPlayers()){
            Ball ball = gameField.getBall();
            boolean impact = false;
            if (s1.getAxisX() <= ball.getAxisX() && ball.getAxisX() <= s1.getAxisX() + s1.getWidth()){
                if ((s1.getAxisY() + s1.getHeight()) >= (ball.getAxisY() - ball.getRadius()) &&
                        (s1.getAxisY()) <= (ball.getAxisY() - ball.getRadius())){
                    impact = true;
                    ball.reflectBall(Ball.ImpactLocation.TOP);
                }
                else if (s1.getAxisY() <= ball.getAxisY() + ball.getRadius() &&  s1.getAxisY() >= ball.getAxisY() - ball.getRadius()){
                    ball.reflectBall(Ball.ImpactLocation.BOTTOM);
                    impact = true;

                }  
            }
            else if (s1.getAxisY() <= ball.getAxisY() && ball.getAxisY() <= s1.getAxisY() + s1.getHeight() && !impact){
                if (s1.getAxisX() <= ball.getAxisX() - ball.getRadius() && 
                        s1.getAxisX() + s1.getWidth() >= ball.getAxisX() - ball.getRadius()){
                    ball.reflectBall(Ball.ImpactLocation.LEFT);
                }
                else if (s1.getAxisX() + s1.getWidth() >= ball.getAxisX() + ball.getRadius() && 
                        s1.getAxisX() <= ball.getAxisX() + ball.getRadius() ){
                    ball.reflectBall(Ball.ImpactLocation.RIGHT);
                } 
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
        Ball ball = gameField.getBall(); 
        if ( ball.getAxisY() + ball.getRadius()  >= gameField.getBorderBottom())
              ball.reflectBall(Ball.ImpactLocation.BOTTOM);
        if ( ball.getAxisY()  - ball.getRadius() <= gameField.getBorderTop())
              ball.reflectBall(Ball.ImpactLocation.TOP); 
        
        if ( ball.getAxisX()  + ball.getRadius() >= gameField.getBorderRight()){
            player1Score += 1;
            ball.reflectBall(Ball.ImpactLocation.RIGHT);
            //ball.intialThrowBall(625, 340);
        }
        if ( ball.getAxisX()  - ball.getRadius() <= gameField.getBorderLeft()){
            player2Score += 1;
                        ball.reflectBall(Ball.ImpactLocation.LEFT);

            //ball.intialThrowBall(590,340);
        }
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

    public InputManager getInputManager() {
        return inputManager;
    }

    public void setInputManager(InputManager inputManager) {
        this.inputManager = inputManager;
    }
    
    
    
}
