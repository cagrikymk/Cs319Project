/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.GameManager;
import controller.ScreenManager;
import model.Options;
import view.GameRendererPane;
import view.MultiplayerPane;
/**
 *
 * @author cagrikaymak
 */
public class MultiplayerPaneController {
    private MultiplayerPane multiplayerPane;

	public MultiplayerPaneController(MultiplayerPane pane) {
		this.multiplayerPane = pane;

		multiplayerPane.getBackButton().setOnAction(e -> {
			
			ScreenManager.backToPreviousMenu();
		});
                
                multiplayerPane.getPreviousMapButton().setOnAction(e -> {
                        multiplayerPane.getFieldImagePane().getChildren().clear();
                        multiplayerPane.prevFieldImage();                  		
		});
                
                 multiplayerPane.getNextMapButton().setOnAction(e -> {
                        multiplayerPane.getFieldImagePane().getChildren().clear();
                        multiplayerPane.nextFieldImage();                  		
		});
                 
                 multiplayerPane.getPlayButton().setOnAction(e -> {
                       GameManager.getInstance().init(Options.getInstance(), multiplayerPane.getFriction(), null, false, multiplayerPane.getSelectedImageURL());
                       ScreenManager.changeSceneRoot(multiplayerPane, new GameRendererPane());
                       GameManager.getInstance().startGame();
		});
              
                
	}
}
