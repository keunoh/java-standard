package ch6.constructor;

public class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "handle", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}
