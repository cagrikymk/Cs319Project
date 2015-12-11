/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.PlayGameMenuController;
import controller.ScreenManager;
import javafx.scene.layout.Pane;
import mainPackage.MainClass;
import view.CreditsView;
import view.MainMenu;
import view.MultiplayerPane;
import view.OptionsView;
import view.PlayGameMenuView;
import view.PlayGameMenuView;
import view.SingleplayerPane;

/**
 *
 * @author AhmetAy
 */
public class MainMenuController {

	private Pane mainMenu;

	public MainMenuController(MainMenu mainMenu) {
		this.mainMenu = mainMenu;

		mainMenu.getSingleplayerButton().setOnAction(e -> {
                        SingleplayerPane singleplayerPane = new SingleplayerPane();
			SingleplayerPaneController singleplayerPaneController = new SingleplayerPaneController(singleplayerPane);
			ScreenManager.changeSceneRoot(mainMenu, singleplayerPane);
		});
                
                mainMenu.getMultiplayerButton().setOnAction(e -> {
                        MultiplayerPane multiplayerPane = new MultiplayerPane();
			MultiplayerPaneController multiplayerPaneController = new MultiplayerPaneController(multiplayerPane);
			ScreenManager.changeSceneRoot(mainMenu, multiplayerPane);
		});

		mainMenu.getCreditsButton().setOnAction(e -> {
                        CreditsView creditsView = new CreditsView();
			CreditsPaneController creditsViewController = new CreditsPaneController(creditsView);
			ScreenManager.changeSceneRoot(mainMenu, creditsView);
		});

		mainMenu.getOptionsButton().setOnAction(e -> {
                        OptionsView optionsView = new OptionsView();
			OptionsPaneController optionsViewController = new OptionsPaneController(optionsView);
			ScreenManager.changeSceneRoot(mainMenu, optionsView);
		});
                
                
                
                mainMenu.getExitButton().setOnAction(e -> {
                    System.exit(0);
                });
	}

}
