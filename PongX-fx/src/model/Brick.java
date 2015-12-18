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
public abstract class Brick extends GameObject {
    private ImageView texture;
    private int life;

    public Brick(int axisX, int axisY) {
        super(axisX, axisY, new Rectangle(axisX, axisY, 20, 150));
    }

    public ImageView getTexture() {
        return texture;
    }

    public int getLife() {
        return life;
    }
    
    public void decreaseLife() {
        setLife(getLife() - 1);
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
 
}
