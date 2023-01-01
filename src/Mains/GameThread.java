package Mains;

import javax.swing.*;

public class GameThread extends Thread {
    private GameEngine gameEngine;

    public GameThread(GameEngine gameEngine) {
        super();
        this.gameEngine = gameEngine;
    }

    public void run() {

        while (true) {
            gameEngine.setVisible(true);
            gameEngine.repaint();
            gameEngine.update();


            gameEngine.checkControls();
        }
    }
}