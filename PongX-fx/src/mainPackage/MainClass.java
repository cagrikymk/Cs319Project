package mainPackage;

import view.ScreenManager;
import view.MainMenu;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	private  MainMenu entranceView;
	private  ScreenManager entranceController;

	private static Stage primaryStage;
	private static Scene scene;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		
		entranceView = new MainMenu();
		entranceController = new ScreenManager(entranceView);

		scene = new Scene(entranceView, 1024, 660);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PongX");
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.show();

		
		
		// CSS Connection
		scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
	}
	
	public static void changeSceneRoot(Parent parent){
		scene.setRoot(parent);
		primaryStage.setScene(scene);
	}

}