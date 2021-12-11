/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class ImagePanel extends JPanel {

    ImageIcon backImage;

    public ImagePanel(String imageName) {
        backImage = new ImageIcon(imageName);
    }

}
