/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sun.audio.AudioPlayer;


/**
 *
 * @author cagrikaymak
 */


public class SoundManager {
    
    
    public static void playBackgroundMusic( String s){
        final URL resource = controller.SoundManager.class.getResource(s);
        final Media media = new Media(resource.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.cycleCountProperty();
        mediaPlayer.play();
    }
    public static void playMusic( String s){
        final URL resource = controller.SoundManager.class.getResource(s);
        final Media media = new Media(resource.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
