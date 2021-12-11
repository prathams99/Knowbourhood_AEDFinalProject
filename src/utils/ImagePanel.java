/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

<<<<<<< HEAD
=======
import java.awt.Graphics;
>>>>>>> 7a011ce1dc81068f26fcf59a729edc7cf780f62e
import java.awt.image.BufferedImage;
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

<<<<<<< HEAD
    private BufferedImage getScaledImage() {
        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);

        return image;
=======
    @Override
    protected void paintComponent(Graphics g) {
        BufferedImage scaledImage = getScaledImage();
        super.paintComponent(g);
        g.drawImage(scaledImage, 0, 0, null);
>>>>>>> 7a011ce1dc81068f26fcf59a729edc7cf780f62e
    }
}
