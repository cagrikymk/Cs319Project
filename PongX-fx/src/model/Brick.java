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
import javafx.scene.shape.Shape;
public class Brick extends GameObject {
    Image texture;
    int life;
    double height;
    double width;

    public Brick(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public Image getTexture() {
        return texture;
    }

    public int getLife() {
        return life;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
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
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
 
    public boolean isAlive (){
        if (life == 0)
            return false;
        else
            return true;
    }
}
