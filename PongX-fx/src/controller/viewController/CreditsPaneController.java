/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.ScreenManager;
import view.CreditsPane;

/**
 *
 * @author cagrikaymak
 */
public class CreditsPaneController {
    private CreditsPane creditsView;

    public CreditsPaneController(CreditsPane credits) {
        creditsView = credits;
        
        creditsView.getBackButton().setOnAction(e -> {
             ScreenManager.backToPreviousMenu();   
	});
    }
    
    
}
