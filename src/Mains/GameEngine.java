package Mains;

import Balls.ShooterBalls;
import Panels.*;
import Shooters.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class GameEngine extends JFrame implements MouseListener {
    private int clickCount;
    private int updateCount;
    private int indexBallCount;
    private int indexRowCount;
    private int mouseX;
    private int mouseY;
    private boolean control;
    private MainPanel mainPanel;
    private Shooter shooter;
    public GameEngine(String title, MainPanel mainPanel) {
        super(title);
        control = false;
        updateCount = 0;
        clickCount = 0;
        indexRowCount = 0;
        indexBallCount = 0;
        this.mainPanel = mainPanel;
        this.shooter = new Shooter(
                0,
                560,
                787,
                35
        );
        this.add(mainPanel);
        this.mainPanel.add(shooter);
        this.setBackground(Color.PINK);
        this.setResizable(false);
        this.setFocusable(false);
        this.setSize(787, 640);
        this.setVisible(true);
        this.addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public boolean nextRow() {
        return clickCount == 3;
    }
    public void updateRow() {
        if(nextRow()) {
            shooter.setShooterBalls(new ShooterBalls());
            System.out.println("Satır kaydır");
            clickCount = 0;

            mainPanel.addRow();
            for(Row row : mainPanel.getRows()) {
                row.setY(row.getY() + 35);
                row.setBounds(getX(),getY(),getWidth(),getHeight());
            }
        }
    }
    public void update() {
        updateRow();

    }

    public void checkControlsDelete() {
        if(clickCount != updateCount && control) {
            // çarpan topları silecek olan kod blogu.
            indexBallCount = indexRowCount > 21 ? 0 : indexRowCount;
            if(mainPanel.getRows().size() > indexRowCount) {
                mainPanel.getRows().get(indexRowCount).getRowBalls().getBallsIndex().set(indexBallCount, -1);
                indexBallCount++;
                indexRowCount++;
            }

        }
        updateCount = clickCount;
        control = false;
    }
    public void checkControls() {
        checkControlsDelete();
    }


    @Override
    public void mousePressed(MouseEvent e) {
        clickCount++;
        mouseX = e.getX();
        mouseY = e.getY();
        control = true;
        shooter.setShootCount(clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}