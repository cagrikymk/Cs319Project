/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cagrikaymak
 */
public class ShrinkStickPower implements StickPower {

    private double reduceHeight;
    
    public ShrinkStickPower() {
        reduceHeight = 15;
    }
    
    
    
    @Override
    public void applyStickPower(Stick s) {
        s.changeSize(s.getWidth() , s.getHeight() - reduceHeight);    }
    
}
