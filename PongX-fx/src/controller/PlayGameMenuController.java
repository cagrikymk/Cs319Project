package controller;

import view.PlayGameMenuView;

public class PlayGameMenuController {

	private PlayGameMenuView playGameMenuView;
	
	public PlayGameMenuController(PlayGameMenuView playGameMenuView) {
		this.playGameMenuView = playGameMenuView;
		
		playGameMenuView.getStartGameButton().setOnAction(e -> {
			
		});
		
		playGameMenuView.getChooseLevelButton().setOnAction(e -> {
			
		});
	}
}
