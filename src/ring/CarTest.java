package ring;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        c1.door = 4;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}

class Car{
    String color;
    String gearType;
    int door;

    public Car() {
        this("black", "auto", 1);
    }

    public Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color) {
        this(color, "roll", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
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
