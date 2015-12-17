package mainPackage;

import controller.viewController.MainMenuController;
import controller.ScreenManager;
import controller.SoundManager;
import java.net.URL;
import view.MainMenu;
import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MainClass extends Application {

	private  MainMenu mainMenu;
	private  MainMenuController mainMenuController;
        private  SoundManager soundManager;

	private static Stage primaryStage;
	private static Scene scene;
        private static Parent prevParent , curParent;
        
        
                
        
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		
		mainMenu = new MainMenu();
		mainMenuController = new MainMenuController(mainMenu);
                soundManager = new SoundManager();

		scene = new Scene(mainMenu, 1366, 768);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PongX");
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.show();
                
                ScreenManager.setScene(scene);
                ScreenManager.setPrimaryStage(primaryStage);
                SoundManager.playBackgroundMusic("/ali.mp3");
            
		
		// CSS Connection
		scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
                
                Image image = new Image(getClass().getResourceAsStream("/cursor.png"));  //pass in the image path
                scene.setCursor(new ImageCursor(image));
	}
	

}