/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.ScreenManager;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import view.CreditsView;
import view.OptionsView;

/**
 *
 * @author cagrikaymak
 */
public class OptionsPaneController {
     private OptionsView optionsView;

    public OptionsPaneController(OptionsView optionsView) {
        this.optionsView = optionsView;
        
        optionsView.getBackButton().setOnAction(e -> {
             ScreenManager.backToPreviousMenu();   
	});
    }
    
}
