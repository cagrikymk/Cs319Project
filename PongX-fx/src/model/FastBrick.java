/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class FastBrick extends Brick {
    private int speedUP;

    public FastBrick(int axisX, int axisY) {
        super(axisX, axisY);
        setTexture(new ImageView(new Image(getClass().getResourceAsStream("/bricks/FastBrick.png"), getWidth(), getHeight(), false, true)));
        setLife(2);
    }


    public double getSpeedUP() {
        return speedUP;
    }

    public void setSpeedUP(int speedUP) {
        this.speedUP = speedUP;
    }
    public void speedUpBall(Ball b){
        getVelocityVector().x = getVelocityVector().x + speedUP;
        getVelocityVector().y = getVelocityVector().y + speedUP;
    }
}
