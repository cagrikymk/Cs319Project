/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CreditsView;
import view.OptionsView;

/**
 *
 * @author cagrikaymak
 */
public class OptionsViewController {
     private OptionsView optionsView;

    public OptionsViewController(OptionsView optionsView) {
        this.optionsView = optionsView;
        
        optionsView.getBackButton().setOnAction(e -> {
             ScreenManager.backToPreviousMenu();   
	});
    }
    
}
