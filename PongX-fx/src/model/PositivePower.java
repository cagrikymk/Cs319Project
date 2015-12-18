/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class PositivePower extends Power{

    public PositivePower(int x, int y) {
        super(x,y);
        super.setPowerID(1);
        super.getShape().setFill(Color.CYAN);
        setBallPower(new SpeedUpBalPower());
    }


   
   public void getPower(Ball b1 ){
       if ( this.isAlive() ){
           getBallPower().applyBallPower(b1);
       }
   }
}
