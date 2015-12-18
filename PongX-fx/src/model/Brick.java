/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cagrikaymak
 */
import java.awt.Point;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
public abstract class Brick extends GameObject  {
    private ImageView texture;
    private int life;
    private BallPower ballPower; // bridge

    public Brick(int axisX, int axisY, int life) {
        super(axisX, axisY, new Rectangle(axisX, axisY, 20, 150));
        this.life = life;
    }
    
    public void applyBallPowers(Ball b) {
        if(ballPower != null) {
            applyBallPowers(b);
        }
    }

    public ImageView getTexture() {
        return texture;
    }

    public int getLife() {
        return life;
    }
    
    public void decreaseLife() {
        life--;
        if(life <= 0)
            setIsAlive(false);
    }

    public double getHeight() {
        return ((Rectangle)getShape()).getHeight();
    }

    public double getWidth() {
        return ((Rectangle)getShape()).getWidth();
    }

    public void setTexture(ImageView texture) {
        this.texture = texture;
    }
    @Override
    public void setLocation(Point point) {
        super.setLocation(point);
        texture.setLayoutX(point.x);
        texture.setLayoutX(point.y);     
    }
    

    public void setLife(int life) {
        
        if (life <= 0) {
           setIsAlive(false);
           this.life = 0; // life cannot smaller than 0
        }
            
    }

    public void setHeight(double height) {
        ((Rectangle)getShape()).setHeight(height);
    }

    public void setWidth(double width) {
        ((Rectangle)getShape()).setHeight(width);
    }

    public BallPower getBallPower() {
        return ballPower;
    }

    public void setBallPower(BallPower ballPower) {
        this.ballPower = ballPower;
    }
    
    
 
}
