/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cagrikaymak
 */
public class ScreenManager {
    private static Parent prevParent;
    private static Parent curParent;
    private static Scene scene;
    private static Stage primaryStage;
    
    
    public static void changeSceneRoot(Parent prev, Parent parent){
            prevParent = prev;
            curParent = parent;                  
            scene.setRoot(parent);
            primaryStage.setScene(scene);
    }
    
     public static void backToPreviousMenu(){
         changeSceneRoot(curParent, prevParent);
     }

    public static Parent getPrevParent() {
        return prevParent;
    }

    public static void setPrevParent(Parent prevParent) {
        ScreenManager.prevParent = prevParent;
    }

    public static Parent getCurParent() {
        return curParent;
    }

    public static void setCurParent(Parent curParent) {
        ScreenManager.curParent = curParent;
    }

    public static Scene getScene() {
        return scene;
    }

    public static void setScene(Scene scene) {
        ScreenManager.scene = scene;
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        ScreenManager.primaryStage = primaryStage;
    }
    
    
    
}
