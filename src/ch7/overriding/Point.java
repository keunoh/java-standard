package ch7.overriding;

public class Point {
    int x = 10;
    int y = 20;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y:" + y;
    }
}
