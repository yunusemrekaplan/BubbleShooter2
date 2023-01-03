package Mains;

// Oyunu yöneten sınıf.

import Balls.*;
import Panels.*;
import Shooters.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameEngine extends JFrame implements MouseListener {
    private int shootCount;
    private int updateCount;
    private int indexBallCount;
    private int indexRowCount;
    private int mouseX;
    private int mouseY;
    private boolean control;
    private StartPanel startPanel;
    private MainPanel mainPanel;
    private Shooter shooter;
    public GameEngine(String title,  StartPanel startPanel, MainPanel mainPanel) {
        super(title);
        control = false;
        updateCount = 0;
        shootCount = 0;
        indexRowCount = 0;
        indexBallCount = 0;
        this.mainPanel = mainPanel;
        this.startPanel = startPanel;
        this.shooter = new Shooter(0, 560, 787, 35, this);  //560
        this.add(mainPanel);
        //this.add(startPanel);
        this.mainPanel.add(shooter);
        this.setBackground(Color.PINK);
        this.setResizable(false);
        this.setFocusable(false);
        this.setSize(787, 640); // 787 640
        this.setVisible(true);
        this.addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showWarning() {
        JOptionPane.showMessageDialog(this, "Oyun Bitti", "Uyarı", JOptionPane.WARNING_MESSAGE);
    }

    public boolean nextRow() {
        return shootCount == 3;
    }
    public void updateRow() {
        if(nextRow()) {
            shooter.setShooterBalls(new ShooterBalls());
            System.out.println("Satır kaydır");
            shootCount = 0;

            mainPanel.addRow();
            for(Row row : mainPanel.getRows()) {
                row.setY(row.getY() + 35);
                row.setBounds(getX(),getY(),getWidth(),getHeight());
                if(row.getY() >= 560) {
                    System.out.println("Oyun Bitti");
                    showWarning();
                    //mainPanel.setVisible(false);
                    //startPanel.setVisible(true);
                }
            }
        }
    }
    public void update() {
        updateRow();
    }

    public void checkControlsDelete() {
        if(shootCount != updateCount && control) {
            // Topları silecek olan kod blogu.
            indexBallCount = indexBallCount > 21 ? 0 : indexBallCount;

            if(mainPanel.getRows().size() > indexRowCount) {
                mainPanel.getRows().get(indexRowCount).getRowBalls().getBallsIndex().set(indexBallCount, -1);
                System.out.println("Top silindi: "+ indexRowCount + ": "+ indexBallCount);
                indexBallCount++;
                indexRowCount++;
            }
        }
        updateCount = shootCount;
        control = false;
    }
    public void checkControls() {
        checkControlsDelete();
    }


    @Override
    public void mousePressed(MouseEvent e) {
        shootCount++;
        mouseX = e.getX();
        mouseY = e.getY();
        control = true;
        shooter.setShootCount(shootCount);
    }

    public int getShootCount() {
        return shootCount;
    }

    public void setShootCount(int shootCount) {
        this.shootCount = shootCount;
    }

    public int getMouseX() {
        return mouseX;
    }

    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
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