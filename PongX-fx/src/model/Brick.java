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
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
public class Brick extends GameObject {
    Image texture;
    int life;

    public Brick(int axisX, int axisY) {
        super(axisX, axisY, new Rectangle(axisX, axisY, 20, 150));
    }

    public Image getTexture() {
        return texture;
    }

    public int getLife() {
        return life;
    }

    public double getHeight() {
        return ((Rectangle)getShape()).getHeight();
    }

    public double getWidth() {
        return ((Rectangle)getShape()).getWidth();
    }

    public void setTexture(Image texture) {
        this.texture = texture;
    }

    public void setLife(int life) {
        this.life = life;
        
        if (life <= 0) {
           setIsAlive(false);
           life = 0; // life cannot smaller than 0
        }
            
    }

    public void setHeight(double height) {
        ((Rectangle)getShape()).setHeight(height);
    }

    public void setWidth(double width) {
        ((Rectangle)getShape()).setHeight(width);
    }
 
    public boolean isAlive (){
        if (life == 0)
            return false;
        else
            return true;
    }
}
