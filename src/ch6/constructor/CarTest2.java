package ch6.constructor;

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
