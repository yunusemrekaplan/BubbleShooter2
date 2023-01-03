package Shooters;

import Balls.ShooterBalls;
import Mains.GameEngine;
import Printers.ShooterPrinter;

import javax.swing.*;
import java.awt.*;

public class Shooter extends JPanel implements ShooterPrinter {
    private int x; //= 385;
    private int y; //= 560;
    private int width;
    private int height;
    private int speed;
    private int shootCount;
    private ShooterBalls shooterBalls;
    private GameEngine gameEngine;

    public Shooter(int x, int y, int width, int height, GameEngine gameEngine) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.shooterBalls = new ShooterBalls();
        this.gameEngine = gameEngine;
        this.setBackground(Color.PINK);
        shootCount = 0;
        speed = 1;
    }


    public void shoot(Graphics g, int mouseX, int mouseY) {
        int tempX = mouseX / 35;
        int tempY = mouseY / 35;

        if(shootCount == 1) {
            shooterBalls.getBalls().get(0).setBounds(tempX*35, tempY*35, 35, 35);
        }
        else if(shootCount == 2) {
            shooterBalls.getBalls().get(1).setBounds(tempX*35, tempY*35, 35, 35);
        }
        else if(shootCount == 3) {
            shooterBalls.getBalls().get(2).setBounds(tempX*35, tempY*35, 35, 35);
        }
    }

    @Override
    public void drawMain(Graphics g) {
        g.drawImage(shooterBalls.getBalls().get(0).getImage(), 350, 0, 35, 35, this);
        g.drawImage(shooterBalls.getBalls().get(1).getImage(), 310, 2, 30, 30, this);
        g.drawImage(shooterBalls.getBalls().get(2).getImage(), 270, 2, 30, 30, this);
    }

    @Override
    public void draw(Graphics g) {
        if(shootCount == 1) {
            g.drawImage(shooterBalls.getBalls().get(1).getImage(), 350, 0, 35, 35, this);
            g.drawImage(shooterBalls.getBalls().get(2).getImage(), 310, 2, 30, 30, this);
        }
        if(shootCount == 2) {
            g.drawImage(shooterBalls.getBalls().get(2).getImage(), 350, 0, 35, 35, this);
        }
        if(shootCount == 0 || shootCount == 3) {
            drawMain(g);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
        shoot(g, gameEngine.getMouseX(), gameEngine.getMouseY());
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getShootCount() {
        return shootCount;
    }

    public void setShootCount(int shootCount) {
        this.shootCount = shootCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ShooterBalls getShooterBalls() {
        return shooterBalls;
    }

    public void setShooterBalls(ShooterBalls shooterBalls) {
        this.shooterBalls = shooterBalls;
    }
}
