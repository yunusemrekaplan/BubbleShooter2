package Shooters;

import Balls.ShooterBalls;
import Printers.ShooterPrinter;

import javax.swing.*;
import java.awt.*;

public class Shooter extends JPanel implements ShooterPrinter {
    private int x; //= 385;
    private int y; //= 560;
    private int width;
    private int height;
    private int shootCount;
    private ShooterBalls shooterBalls;

    public Shooter(int x, int y, int width, int height, ShooterBalls shooterBalls) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.shooterBalls = shooterBalls;
        shootCount = 0;
    }

    @Override
    public void drawMain(Graphics g) {

    }

    @Override
    public void draw(Graphics g) {

    }
}
