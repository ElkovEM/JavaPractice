package pr2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball Ball = new Ball(5, 10);
        System.out.println("Placement of the ball:\n x: " + Ball.getX() + "\n y: " + Ball.getY());
        Ball.move(3, -1);
        System.out.println("Placement of the ball:\n x: " + Ball.getX() + "\n y: " + Ball.getY());
    }

}
