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
 * @author fcagil
 */
public class StickPositivePower extends Power{
    
    private double enlargeHeight = 25;
    
    public StickPositivePower(int x, int y) {
        super(x,y);
        super.setPowerID(3);
    }

    public double getEnlargeHeight() {
        return enlargeHeight;
    }

    public void setEnlargeHeight(double enlargeHeight) {
        this.enlargeHeight = enlargeHeight;
    }
    
   public void enlargeStick(Stick s){
       if ( this.isIsAlive() ){
           s.changeSize(s.getWidth(), s.getHeight() +enlargeHeight);
           System.out.println("+25 of " + s);
       }   
   }
}
