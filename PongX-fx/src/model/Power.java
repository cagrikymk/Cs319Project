/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.shape.Circle;
/**
 *
 * @author cagrikaymak
 */
public class Power extends GameObject {
    private int powerID; // NegativePower=0, PositivePower=1, StickNegativePower=2, StickPositivePower=3
    

    public Power(int x, int y) {
        super(x, y, new Circle(x, y, 30));
        
    }

    public int getPowerID() {
        return powerID;
    }



    public void setPowerID(int powerID) {
        this.powerID = powerID;
    }
    
    
    
}
