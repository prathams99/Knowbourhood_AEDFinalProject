/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JWindow;

/**
 *
 * @author prath
 */
public class LoadingScreen extends JWindow {
    
    public static boolean isDone = false;
    
    public static void main(String[] args) {
        new LoadingScreen();
    }
}
