/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.GameManager;
import controller.InputManager;
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
            String brickSet = (String) multiplayerPane.getBrickSetComboBox().getValue();
            GameManager.getInstance().init(Options.getInstance(), multiplayerPane.getFriction(), brickSet, false, multiplayerPane.getSelectedImageURL());
            
            GameRendererPane renderer = new GameRendererPane();
            GameRendererController rendererController = new GameRendererController(renderer);
            GameManager.getInstance().setRenderer(renderer);
            ScreenManager.changeSceneRoot(multiplayerPane, renderer);
            GameManager.getInstance().startGame();
        }); 

    }
}
