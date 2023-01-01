package Shooters;

import Balls.*;

import java.util.ArrayList;
import java.util.Random;

public class ShooterBalls {
    Random random = new Random();
    private ArrayList<Ball> balls;
    private ArrayList<Integer> ballsIndex;

    public ShooterBalls() {
        ballsArray();
    }

    public int randomIndex() {
        return random.nextInt(6);
    }

    public void ballsArray() {
        ArrayList<Ball> balls = new ArrayList<>();
        ArrayList<Integer> ballsIndex = new ArrayList<>();
        int index = 0;
        for(int i=0; i<7; i++) {
            index = randomIndex();
            if(index == 0) {
                balls.add(new Ball1(35,35, "1.png"));
                ballsIndex.add(index);
            }
            else if(index == 1) {
                balls.add(new Ball2(35,35, "2.png"));
                ballsIndex.add(index);
            }
            else if(index == 2) {
                balls.add(new Ball3(35,35, "3.png"));
                ballsIndex.add(index);
            }
            else if(index == 3) {
                balls.add(new Ball4(35,35, "4.png"));
                ballsIndex.add(index);
            }
            else if(index == 4) {
                balls.add(new Ball5(35,35, "5.png"));
                ballsIndex.add(index);
            }
            else if(index == 5) {
                balls.add(new Ball6(35,35, "6.png"));
                ballsIndex.add(index);
            }
            else {
                System.out.println("index: "+index);
            }
        }
        this.balls = balls;
        this.ballsIndex = ballsIndex;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public ArrayList<Integer> getBallsIndex() {
        return ballsIndex;
    }

    public void setBallsIndex(ArrayList<Integer> ballsIndex) {
        this.ballsIndex = ballsIndex;
    }
}
