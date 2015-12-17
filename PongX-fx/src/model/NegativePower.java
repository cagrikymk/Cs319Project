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

    private double slowDown = 3;
    private double shrinkHeight;
    private double shrinkWidht;

    public NegativePower(int x, int y) {
        super(x, y);
        super.setPowerID(0);
        super.getShape().setFill(Color.CORAL);
    }

    public double getSlowDown() {
        return slowDown;
    }

    public void setSlowDown(double slowDown) {
        this.slowDown = slowDown;
    }

    public void getPower(Ball b1) {
        if (this.isAlive()) {
            Point p1 = b1.getVelocityVector();
            System.out.println("Vel Vec before slowDown " + p1);
            if (Math.abs(p1.x) > 5) {
                p1.x -= p1.x / slowDown;
                p1.y -= p1.y / slowDown;
                b1.setVelocityVector(p1);
                System.out.println("Vel Vec after slowDown " + p1);
            }
        }
    }
}
