package Mains;

import Balls.*;

import java.awt.*;

public class Row extends MainPanel {
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
        this.setBounds(x,y,width,height);
        this.setBackground(Color.pink);
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

    public RowBalls getRowBalls() {
        return rowBalls;
    }

    public void setRowBalls(RowBalls rowBalls) {
        this.rowBalls = rowBalls;
    }
}
