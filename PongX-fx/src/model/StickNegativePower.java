/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import javafx.scene.shape.Shape;

/**
 *
 * @author fatih
 */
public class StickNegativePower extends Power{
    private double reduceHeight = 9;

    public StickNegativePower(int x, int y) {
        super(x,y);
        super.setPowerID(2);
    }

    public double getReduceHeight() {
        return reduceHeight;
    }
    public void setReduceHeight(double reduceHeight) {
        this.reduceHeight = reduceHeight;
    }

    public void reduceStick(Stick s){
       if ( this.isIsAlive() ){
           s.changeSize(s.getWidth() , s.getHeight() - reduceHeight);
           
       }
            
    }
   
}
