package Panels;

import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {
    private JButton startButton;

    public StartPanel() {
        super();
        this.startButton = new JButton("Start");
        //add(startButton);
        //this.requestFocus();
        //this.setFocusable(true);
        this.setVisible(false);
        setBackground(Color.PINK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(200,200,70,70);
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }
}
