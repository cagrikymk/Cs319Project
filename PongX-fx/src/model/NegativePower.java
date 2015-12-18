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
public class NegativePower extends Power {

    private double shrinkHeight;
    private double shrinkWidht;

    public NegativePower(int x, int y) {
        super(x, y);
        super.setPowerID(0);
        super.getShape().setFill(Color.CORAL);
        setBallPower(new SlowDownBallPower());
    }


    public void getPower(Ball b1) {
        if (this.isAlive()) {
            getBallPower().applyBallPower(b1);
        }
    }
}
