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
public class EnlargeStickPower implements StickPower {

    private double enlargeHeight;
    
    public EnlargeStickPower() {
        enlargeHeight = 35;
    }
    
    
    
    @Override
    public void applyStickPower(Stick s) {
           s.changeSize(s.getWidth(), s.getHeight() +enlargeHeight);
           System.out.println("+25 of " + s);
         
    }
    
}
