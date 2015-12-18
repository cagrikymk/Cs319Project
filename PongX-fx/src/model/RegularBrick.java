/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class RegularBrick extends Brick {

    public RegularBrick(int axisX, int axisY) {
        super(axisX, axisY, 1);
        setTexture((new ImageView(new Image(getClass().getResourceAsStream("/bricks/RegularBrick.png"), getWidth(), getHeight(), false, true))));
    }

    @Override
    public void applyBallPowers(Ball b) {
    }
    
}
