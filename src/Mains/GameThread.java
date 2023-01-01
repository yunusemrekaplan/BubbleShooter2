package Mains;

import javax.swing.*;

public class GameThread extends Thread {
    private JFrame frame;
    private GameEngine gameEngine;

    public GameThread(JFrame frame, GameEngine gameEngine) {
        super();
        this.frame = frame;
        this.gameEngine = gameEngine;
    }

    public void run() {

        while (true) {
            gameEngine.setVisible(true);
            frame.repaint();
            gameEngine.update();


            gameEngine.checkControls();
        }
    }
}