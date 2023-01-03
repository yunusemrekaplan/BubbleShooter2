package Balls;

// Top sınıfı.
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Ball extends JComponent {
    private BufferedImage image;
    private int width;
    private int height;
    private String varlik;

    public Ball(int width, int height, String varlik) {
        this.width = width;
        this.height = height;
        try {
            image = ImageIO.read(new FileImageInputStream(new File(varlik)));
        } catch (IOException ex) {
            Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getVarlik() {
        return varlik;
    }

    public void setVarlik(String varlik) {
        this.varlik = varlik;
    }
}
