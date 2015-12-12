/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class FastBrick extends Brick {
    private double speedUP;

    public FastBrick(double axisX, double axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getSpeedUP() {
        return speedUP;
    }

    public void setSpeedUP(int speedUP) {
        this.speedUP = speedUP;
    }
    public void speedUpBall(Ball b){
        b.changeSpeed(speedUP);
    }
}
