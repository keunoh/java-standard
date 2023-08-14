package overriding;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3.getLocation());
    }

    static class Point {
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        String getLocation() {
            return "x :" + x + ", y :" + y;
        }
    }

    static class Point3D extends Point {
        int z;

        public Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
        String getLocation() {
            return "x :" + x + ", y :" + y + ", z :" + z;
        }
    }
}
