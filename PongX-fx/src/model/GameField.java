/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.image.Image;
import java.util.ArrayList;

/**
 *
 * @author cagrikaymak
 */
public class GameField {
    ArrayList<Ball> Balls;
    ArrayList<Power> Powers;
    ArrayList<Brick> bricks;
    double friction;
    Image texture;

    public GameField(ArrayList<Ball> Balls, ArrayList<Power> Powers, ArrayList<Brick> bricks, double friction, Image texture) {
        this.Balls = Balls;
        this.Powers = Powers;
        this.bricks = bricks;
        this.friction = friction;
        this.texture = texture;
    }

    public ArrayList<Ball> getBalls() {
        return Balls;
    }

    public ArrayList<Power> getPowers() {
        return Powers;
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public double getFriction() {
        return friction;
    }

    public Image getTexture() {
        return texture;
    }

    public void setBalls(ArrayList<Ball> Balls) {
        this.Balls = Balls;
    }

    public void setPowers(ArrayList<Power> Powers) {
        this.Powers = Powers;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public void setTexture(Image texture) {
        this.texture = texture;
    }
    public void addObject(GameObject object){
        
    }
    public void removeObject(GameObject object){
        
    }
    public void loadBricks(ArrayList<Brick> Bricks){
        
    }
}
