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
public class StrongBrick extends Brick {
    private int extraLife;

    public StrongBrick(int axisX, int axisY) {
        super(axisX, axisY);
    }

    public int getExtraLife() {
        return extraLife;
    }

    public void setExtraLife(int extraLife) {
        this.extraLife = extraLife;
    }
    
}
