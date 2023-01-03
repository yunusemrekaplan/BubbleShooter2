package Mains;

import Panels.StartPanel;

import javax.swing.*;

public class GameThread extends Thread {
    private GameEngine gameEngine;
    private StartPanel startPanel;

    public GameThread(GameEngine gameEngine, StartPanel startPanel) {
        super();
        this.gameEngine = gameEngine;
        this.startPanel = startPanel;
    }

    public void run() {
        //gameEngine.setVisible(true);

        while (true) {
            gameEngine.setVisible(true);
            gameEngine.repaint();
            gameEngine.update();


            gameEngine.checkControls();
        }
    }
}