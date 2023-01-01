package Balls;

public class Bullet extends Ball {
    private int speed;

    public Bullet(int width, int height, String varlik, int speed) {
        super(width, height, varlik);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
