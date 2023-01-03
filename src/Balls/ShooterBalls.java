package Balls;

// Shootera ait toplar bu sınıfta yaratılır. Her üç atıştan sonra bu sınıftan yeni bir nesne oluşturulur.

import java.util.ArrayList;
import java.util.Random;

public class ShooterBalls {
    Random random = new Random();
    private int size = 3;
    private ArrayList<Ball> balls = new ArrayList<>(); // Topları tutacak liste.
    private ArrayList<Integer> ballsIndex = new ArrayList<>(); // Topların indeksini tutacak sınıf.

    public ShooterBalls() {
        ballsArray();
    }

    public int randomIndex() {
        return random.nextInt(6);
    }

    public void ballsArray() {
        int index = 0;
        for(int i=0; i<size; i++) {
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
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
