package pr2.CircleObject;

public class CircleTest {
    public static void main(String[] args) {
        CircleObject Circle1 = new CircleObject(3, 5, 9);
        CircleObject Circle2 = new CircleObject(10, 40, 50);
        Circle1.compareCircles(Circle1, Circle2);
    }
}
