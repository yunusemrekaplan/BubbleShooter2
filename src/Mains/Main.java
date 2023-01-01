package Mains;

import Panels.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Row> rows = new ArrayList<>();
        MainPanel mainPanel = new MainPanel(rows);
        GameEngine gameEngine = new GameEngine("Bubble Shooter", mainPanel);
        gameEngine.setVisible(true);

        GameThread gameThread = new GameThread(gameEngine);
        gameThread.start();
    }
}