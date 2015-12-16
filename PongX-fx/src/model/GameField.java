/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import javafx.scene.image.Image;
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class GameField {
    private Ball ball;
    private ArrayList<Power> powers;
    private ArrayList<Brick> bricks;
    private double friction;
    private String imageURL;
    private Rectangle activeField;
    private Stick players[];

    public GameField( Ball ball, ArrayList<Brick> bricks, Stick sticks[], double friction, String imageURL) {
        this.ball = ball;
        this.bricks = bricks;
        this.friction = friction;
        this.imageURL = imageURL;
        players = sticks;
        activeField = new Rectangle(181, 84, 1000, 600);  
    }
    
    public void initializeGameField() {
        ball.intialThrowBall(590, 340);
    }

    public ArrayList<Power> getPowers() {
        return powers;
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public double getFriction() {
        return friction;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    

    public void setPowers(ArrayList<Power> Powers) {
        this.powers = Powers;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Stick[] getPlayers() {
        return players;
    }

    public void setPlayers(Stick[] players) {
        this.players = players;
    }
    
    

   
    public void addObject(GameObject object){
        
    }
    public void removeObject(GameObject object){
        
    }
    public void loadBricks(ArrayList<Brick> Bricks){
        
    }

    public void update() {
        // update all game objects which are still alive
        ball.uptade();
        players[0].uptade();
        players[1].uptade();
    }

    public Rectangle getActiveField() {
        return activeField;
    }
    
    public double getBorderRight() {
        return getActiveField().getWidth() + getActiveField().getX();
    }
    
    public double getBorderLeft() {
        return getActiveField().getX();
    }
    
    public double getBorderTop() {
        return getActiveField().getY();
    }
    
    public double getBorderBottom() {
        return getActiveField().getY() + getActiveField().getHeight();
    }

    
}
