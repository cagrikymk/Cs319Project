/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;

/**
 *
 * @author cagrikaymak
 */
public class Options {
    private boolean isSoundEnabled;
    
    private String p1Keys[];
    private String p2Keys[];
    
    private final String filePath = "options/options.txt";
    
    private static Options optionsInstance;

   private Options(){
       // creation options from txt
        try {
            readOptionsFromFile();
        } catch (IOException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
   
   public static Options getInstance() {
       if(optionsInstance == null)
           optionsInstance = new Options();
       return optionsInstance;
   }
   
   
   public void applyOptions() {
        try {
            writeOptionsToFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public void readOptionsFromFile() throws FileNotFoundException, IOException {
       BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
         try {
             String line = bufferedReader.readLine();
             String arr[] = line.split(" ");
             isSoundEnabled = Boolean.parseBoolean(arr[2]);
             System.out.println(isSoundEnabled);
             
             line = bufferedReader.readLine();
             arr = line.split(" ")[2].split(",");
             p1Keys = arr;
             
             line = bufferedReader.readLine();
             arr = line.split(" ")[2].split(",");
             p2Keys = arr;
             
             
         } 
         finally {
             System.out.println("Options are read from file" +  p2Keys[0] + p2Keys[1]);
             bufferedReader.close();
         }
   }
   
   
   private void writeOptionsToFile() throws FileNotFoundException, UnsupportedEncodingException {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            writer.println("sound = " + (isSoundEnabled ? "true" : "false"));
            writer.println("p1keys = " + p1Keys[0] + "," + p1Keys[1]);
            writer.println("p2keys = " + p2Keys[0] + "," + p2Keys[1]);
        }
   }

    public boolean isIsSoundEnabled() {
        return isSoundEnabled;
    }

    public void setIsSoundEnabled(boolean isSoundEnabled) {
        this.isSoundEnabled = isSoundEnabled;
    }

    public String[] getP1Keys() {
        return p1Keys;
    }

    public void setP1Keys(String[] p1Keys) {
        this.p1Keys = p1Keys;
    }

    public String[] getP2Keys() {
        return p2Keys;
    }

    public void setP2Keys(String[] p2Keys) {
        this.p2Keys = p2Keys;
    }
   
   
}
