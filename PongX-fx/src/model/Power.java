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
public class Power extends GameObject {
    private int powerID;
    private double size;

    public Power(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public int getPowerID() {
        return powerID;
    }

    public double getSize() {
        return size;
    }

    public void setPowerID(int powerID) {
        this.powerID = powerID;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
}
