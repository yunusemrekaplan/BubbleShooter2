package Mains;

import Panels.*;

public class Main {
    public static void main(String[] args) {

        StartPanel startPanel = new StartPanel();
        MainPanel mainPanel = new MainPanel();
        GameEngine gameEngine = new GameEngine("Bubble Shooter", startPanel, mainPanel);
        gameEngine.setVisible(true);

        GameThread gameThread = new GameThread(gameEngine, startPanel);
        gameThread.start();
    }
}