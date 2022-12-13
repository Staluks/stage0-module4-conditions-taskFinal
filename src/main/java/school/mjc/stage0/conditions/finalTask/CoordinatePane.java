package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        boolean xPositive = x > 0;
        boolean yPositive = y > 0;
        if (xPositive) {
            if (yPositive) {
                System.out.println("first");
            } else {
                System.out.println("second");
            }
        }else {
            if (yPositive) {
                System.out.println("fourth");
            } else {
                System.out.println("third");
            }
        }
    }
}
