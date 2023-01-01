package Panels;

import Balls.*;
import Printers.*;

import javax.swing.*;
import java.awt.*;

public class Row extends JPanel implements RowPrinter {
    private int x;
    private int y;
    private int width;
    private int height;
    private RowBalls rowBalls;

    public Row(int x, int y, int width, int height, RowBalls rowBalls) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rowBalls = rowBalls;
        setBackground(Color.PINK);
        setBounds(x,y,width,height);
    }

    @Override
    public void draw(Graphics g) {
        for(int i=0; i<rowBalls.getBalls().size(); i++) {
            if(rowBalls.getBallsIndex().get(i) != -1) {
                g.drawImage(rowBalls.getBalls().get(i).getImage(),i*35,0,35,35,this);
            }
        }
    }

    @Override
    public void drawAgain(Graphics g) {
        for(int i=0; i<rowBalls.getBalls().size(); i++) {
            if(rowBalls.getBallsIndex().get(i) != -1) {
                g.drawImage(rowBalls.getBalls().get(i).getImage(),i*35,0,35,35,this);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    @Override
    public void repaint() {
        super.repaint();
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    public RowBalls getRowBalls() {
        return rowBalls;
    }

    public void setRowBalls(RowBalls rowBalls) {
        this.rowBalls = rowBalls;
    }
}
