/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class FastBrick extends Brick {
    

    public FastBrick(int axisX, int axisY) {
        super(axisX, axisY, 2);
        setTexture(new ImageView(new Image(getClass().getResourceAsStream("/bricks/FastBrick.png"), getWidth(), getHeight(), false, true)));
        setBallPower(new SpeedUpBalPower());
    }


    @Override
    public void applyBallPowers(Ball b) {
        getBallPower().applyBallPower(b);
    }
}
