/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.ScreenManager;
import javafx.scene.layout.Pane;
import view.CreditsView;
import view.OptionsView;
import view.SingleplayerPane;

/**
 *
 * @author cagrikaymak
 */
public class SingleplayerPaneController {
    private SingleplayerPane singleplayerPane;

	public SingleplayerPaneController(SingleplayerPane pane) {
		this.singleplayerPane = pane;

		singleplayerPane.getBackButton().setOnAction(e -> {
			
			ScreenManager.backToPreviousMenu();
		});
                
                singleplayerPane.getPreviousMapButton().setOnAction(e -> {
                        singleplayerPane.getFieldImagePane().getChildren().clear();
                        singleplayerPane.prevFieldImage();                  		
		});
                
                 singleplayerPane.getNextMapButton().setOnAction(e -> {
                        singleplayerPane.getFieldImagePane().getChildren().clear();
                        singleplayerPane.nextFieldImage();                  		
		});
                
                
	}
}
