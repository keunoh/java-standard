package ch7.inheritance;

public class Triangle extends Shape {
    Point[] p;

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n"
                , p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
