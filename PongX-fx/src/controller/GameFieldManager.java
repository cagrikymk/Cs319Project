/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Point;
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import model.Stick;
import model.Power;
import model.Ball;
import model.Brick;
import model.GameField;
import model.NegativePower;
import model.Options;
import model.PositivePower;
import model.StickNegativePower;
import model.StickPositivePower;

/**
 *
 * @author cagrikaymak
 */
public class GameFieldManager {

    private SoundManager soundManager;
    private GameField gameField;
    public final static int MAP_HEIGHT = 600;
    public final static int MAP_WIDTH = 1000;
    public final static int MAP_HEIGHT_OFFSET = 84;
    public final static int MAP_WIDTH_OFFSET = 181;
    private String imageURL;
    private boolean isSingleplayer;
    private int player1Score = 0;
    private int player2Score = 0;
    private InputManager inputManager;

    public GameFieldManager(double friction, ArrayList<Brick> brickSet, ArrayList<Power> powers, boolean isSingleplayer, String imageURL) {
        Stick sticks[] = new Stick[2];
        sticks[0] = new Stick(200, MAP_HEIGHT / 2 + 40, new Rectangle(20, 100));
        sticks[1] = new Stick(MAP_WIDTH + 100, MAP_HEIGHT / 2 + 40, new Rectangle(20, 100));

        gameField = new GameField(new Ball(10, 0, 0), brickSet, powers, sticks, friction, imageURL);
        this.imageURL = imageURL;
        this.isSingleplayer = isSingleplayer;
        inputManager = new InputManager(Options.getInstance().getP1Keys(), Options.getInstance().getP2Keys(), gameField.getPlayers()[0]);
        soundManager = new SoundManager();
        
        if(isSingleplayer == false) {
            inputManager.setP2(gameField.getPlayers()[1]); // multi so input manager handles both user's inputs
        }
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
        detectPowerBallCollision();
        cleanDestroyedObjects();
        
        gameField.update();
    }

    public void detectBrickBallCollision() {
        for (Brick b1 : gameField.getBricks()) {
            Ball ball = gameField.getBall();
            boolean impact = false;
            if (b1.getAxisX() <= ball.getAxisX() && ball.getAxisX() <= b1.getAxisX() + b1.getWidth()) {
                if ((b1.getAxisY() + b1.getHeight()) >= (ball.getAxisY() - ball.getRadius())
                        && (b1.getAxisY()) <= (ball.getAxisY() - ball.getRadius())) {
                    impact = true;
                    ball.reflectBall(Ball.ImpactLocation.TOP);
                } else if (b1.getAxisY() <= ball.getAxisY() + ball.getRadius() && b1.getAxisY() >= ball.getAxisY() - ball.getRadius()) {
                    ball.reflectBall(Ball.ImpactLocation.BOTTOM);
                    impact = true;

                }
            } else if (b1.getAxisY() <= ball.getAxisY() && ball.getAxisY() <= b1.getAxisY() + b1.getHeight() && !impact) {
                if (b1.getAxisX() <= ball.getAxisX() - ball.getRadius()
                        && b1.getAxisX() + b1.getWidth() >= ball.getAxisX() - ball.getRadius()) {
                    ball.reflectBall(Ball.ImpactLocation.LEFT);
                    impact = true;
                } else if (b1.getAxisX() + b1.getWidth() >= ball.getAxisX() + ball.getRadius()
                        && b1.getAxisX() <= ball.getAxisX() + ball.getRadius()) {
                    ball.reflectBall(Ball.ImpactLocation.RIGHT);
                    impact = true;
                }
            } else if (b1.getShape().intersects(ball.getShape().getBoundsInParent())) {
                ball.reflectBall(Ball.ImpactLocation.RIGHT);
                ball.reflectBall(Ball.ImpactLocation.BOTTOM);
                impact = true;
            }
            if(impact == true)
                b1.decreaseLife(); // if brick is hitted decrease life
        }
    }

    public void detectStickBallCollision() {
        for (Stick s1 : gameField.getPlayers()) {
            Ball ball = gameField.getBall();
            boolean impact = false;
            if (s1.getAxisX() <= ball.getAxisX() && ball.getAxisX() <= s1.getAxisX() + s1.getWidth()) {
                if ((s1.getAxisY() + s1.getHeight()) >= (ball.getAxisY() - ball.getRadius())
                        && (s1.getAxisY()) <= (ball.getAxisY() - ball.getRadius())) {
                    impact = true;
                    ball.reflectBall(Ball.ImpactLocation.TOP);
                } else if (s1.getAxisY() <= ball.getAxisY() + ball.getRadius() && s1.getAxisY() >= ball.getAxisY() - ball.getRadius()) {
                    ball.reflectBall(Ball.ImpactLocation.BOTTOM);
                    impact = true;
                }
            } else if (s1.getAxisY() <= ball.getAxisY() && ball.getAxisY() <= s1.getAxisY() + s1.getHeight() && !impact) {
                if (s1.getAxisX() <= ball.getAxisX() - ball.getRadius()
                        && s1.getAxisX() + s1.getWidth() >= ball.getAxisX() - ball.getRadius()) {
                    ball.reflectBall(Ball.ImpactLocation.LEFT);
                    impact = true;
                    
                } else if (s1.getAxisX() + s1.getWidth() >= ball.getAxisX() + ball.getRadius()
                        && s1.getAxisX() <= ball.getAxisX() + ball.getRadius()) {
                    ball.reflectBall(Ball.ImpactLocation.RIGHT);
                    impact = true;

                }
            } else if (s1.getShape().intersects(ball.getShape().getBoundsInParent())) {
                impact = true;
                
                ball.reflectBall(Ball.ImpactLocation.RIGHT);
                ball.reflectBall(Ball.ImpactLocation.BOTTOM);
            }

            if (impact == true) {
                soundManager.playMusic("/blaster.mp3");
                if (s1 == gameField.getPlayer(0)) {
                    ball.setLastHit(0);
                    System.out.println("BALL HIT P1");
                } else {
                    ball.setLastHit(1);
                }
            }
        }
    }

    public void detectPowerBallCollision() {
        for (Power p1 : gameField.getPowers()) {
            //Shape s1 = Shape.intersect(gameField.getBall().getShape(), p1.getShape());
            if (p1.getShape().intersects(gameField.getBall().getShape().getBoundsInParent())) {
                //if ( s1 != null){
                if (p1.getPowerID() == 0) {
                    ((NegativePower) p1).getPower(gameField.getBall());
                } else if (p1.getPowerID() == 1) {
                    ((PositivePower) p1).getPower(gameField.getBall());
                } else if (p1.getPowerID() == 2) {
                    if (gameField.getBall().getLastHit() == 0) {
                        ((StickNegativePower) p1).reduceStick(gameField.getPlayer(0));
                    } else {
                        ((StickNegativePower) p1).reduceStick(gameField.getPlayer(1));
                    }
                } else if (p1.getPowerID() == 3) {
                    if (gameField.getBall().getLastHit() == 0) {
                        ((StickPositivePower) p1).enlargeStick(gameField.getPlayer(0));
                    } else {
                        ((StickPositivePower) p1).enlargeStick(gameField.getPlayer(1));
                    }
                }
                p1.setIsAlive(false);
            }
        }
    }
    
    public void cleanDestroyedObjects() {
        int i = 0;
        while (i < gameField.getPowers().size()) {
            if(gameField.getPowers().get(i).isAlive() == false) {
                gameField.getPowers().get(i).setLocation(new Point(2000, 2000));
                gameField.getPowers().remove(i);
            }
            else {
                i++;
            }
        }
         i = 0;
        while (i < gameField.getBricks().size()) {
            if(gameField.getBricks().get(i).isAlive() == false) {
                gameField.getBricks().get(i).setLocation(new Point(2000, 2000));
                gameField.getBricks().remove(i);
            }
            else {
                i++;
            }
        }
        
        
    }

    public void detectBorderCollision() {
        Ball ball = gameField.getBall();
        if (ball.getAxisY() + ball.getRadius() >= gameField.getBorderBottom()) {
            ball.reflectBall(Ball.ImpactLocation.BOTTOM);
        }
        if (ball.getAxisY() - ball.getRadius() <= gameField.getBorderTop()) {
            ball.reflectBall(Ball.ImpactLocation.TOP);
        }

        if (ball.getAxisX() + ball.getRadius() >= gameField.getBorderRight()) {
            player1Score += 1;
            
            ball.reflectBall(Ball.ImpactLocation.RIGHT);
            //ball.intialThrowBall(625, 340);
        }
        if (ball.getAxisX() - ball.getRadius() <= gameField.getBorderLeft()) {
            player2Score += 1;
            ball.reflectBall(Ball.ImpactLocation.LEFT);

            //ball.intialThrowBall(590,340);
        }
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

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }
    
    

}
