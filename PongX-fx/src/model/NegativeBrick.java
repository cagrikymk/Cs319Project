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
public class NegativeBrick extends Brick{
    int speedDown;

    public NegativeBrick(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public int getSpeedDown() {
        return speedDown;
    }

    public void setSpeedDown(int speedDown) {
        this.speedDown = speedDown;
    }
    
    
}
