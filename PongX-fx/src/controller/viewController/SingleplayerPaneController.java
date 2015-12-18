/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.GameManager;
import controller.ScreenManager;
import javafx.scene.layout.Pane;
import model.Options;
import view.CreditsPane;
import view.GameRendererPane;
import view.OptionsPane;
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
            System.out.println((int)singleplayerPane.getAILevelComboBox().getValue());
        });

        singleplayerPane.getPlayButton().setOnAction(e -> {
            String brickSet = (String) singleplayerPane.getBrickSetComboBox().getValue();
            GameManager.getInstance().init(Options.getInstance(), singleplayerPane.getFriction(), brickSet, true, singleplayerPane.getSelectedImageURL());
             GameManager.getInstance().setAiLevel((int)singleplayerPane.getAILevelComboBox().getValue());
             
            GameRendererPane renderer = new GameRendererPane();
            GameRendererController rendererController = new GameRendererController(renderer);
            GameManager.getInstance().setRenderer(renderer);
            ScreenManager.changeSceneRoot(singleplayerPane, renderer);
            GameManager.getInstance().startGame();
        });
        

    }
}
