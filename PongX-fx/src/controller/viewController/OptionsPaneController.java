/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.ScreenManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            try {
                optionsView.getOptions().readOptionsFromFile();
            } catch (IOException ex) {
                Logger.getLogger(OptionsPaneController.class.getName()).log(Level.SEVERE, null, ex);
            }
             ScreenManager.backToPreviousMenu();   
	});
        
        optionsView.getSaveButton().setOnAction(e -> {
            optionsView.getOptions().setIsSoundEnabled(optionsView.getSoundSwitch().switchOnProperty().getValue());
            optionsView.getOptions().applyOptions();
	});
        
        
        
        
    }
    
}
