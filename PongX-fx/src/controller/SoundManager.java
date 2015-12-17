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
import model.Options;
import sun.audio.AudioPlayer;


/**
 *
 * @author cagrikaymak
 */


public class SoundManager {
    
    private static String explosionSound = "/explosion.mp3";
    private static String blasterSound = "/blaster.mp3";
    private static String powerSound = "/power.mp3";
    private static String backgroundMusic = "/ali.mp3";
    private static MediaPlayer mediaPlayer;
    public static void playBackgroundMusic(){
        final URL resource = controller.SoundManager.class.getResource(backgroundMusic);
        final Media media = new Media(resource.toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.cycleCountProperty();
        mediaPlayer.play();
    }
    public static void playMusic( String s){
        if(Options.getInstance().isIsSoundEnabled()) {
            final URL resource = controller.SoundManager.class.getResource(s);
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        }    
        
    }
    
    public static void playExplosionSound() {
        playMusic(explosionSound);
    }
    
     public static void playPowerSound() {
        playMusic(powerSound);
    }
     
      public static void playBlasterSound() {
        playMusic(blasterSound);
    }

    public static MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
      
      
}
