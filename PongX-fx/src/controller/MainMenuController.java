/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.PlayGameMenuController;
import javafx.scene.layout.Pane;
import mainPackage.MainClass;
import view.CreditsView;
import view.MainMenu;
import view.OptionsView;
import view.PlayGameMenuView;
import view.PlayGameMenuView;

/**
 *
 * @author AhmetAy
 */
public class MainMenuController {

	private Pane mainMenu;

	public MainMenuController(MainMenu mainMenu) {
		this.mainMenu = mainMenu;

		mainMenu.getSingleplayerButton().setOnAction(e -> {
			PlayGameMenuView playGameMenuView = new PlayGameMenuView();
			PlayGameMenuController playGameMenuController = new PlayGameMenuController(playGameMenuView);
			ScreenManager.changeSceneRoot(mainMenu, playGameMenuView);
		});

		mainMenu.getCreditsButton().setOnAction(e -> {
                        CreditsView creditsView = new CreditsView();
			CreditsViewController creditsViewController = new CreditsViewController(creditsView);
			ScreenManager.changeSceneRoot(mainMenu, creditsView);
		});

		mainMenu.getOptionsButton().setOnAction(e -> {
                        OptionsView optionsView = new OptionsView();
			OptionsViewController optionsViewController = new OptionsViewController(optionsView);
			ScreenManager.changeSceneRoot(mainMenu, optionsView);
		});
                
                mainMenu.getExitButton().setOnAction(e -> {
                    System.exit(0);
                });
	}

}
