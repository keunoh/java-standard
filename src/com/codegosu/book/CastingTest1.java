package com.codegosu.book;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        fe2 = (FireEngine) car;
        fe2.water();
    }

    static class Car {
        String color;
        int door;

        void drive() {
            System.out.println("drive");
        }

        void stop() {
            System.out.println("Car.stop");
        }
    }
    static class FireEngine extends Car {
        void water() {
            System.out.println("FireEngine.water");
        }
    }
}
