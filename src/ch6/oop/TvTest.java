package ch6.oop;

public class TvTest {

    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("t.channel = " + t.channel);
    }

    static class Tv {
        String color;
        boolean power;
        int channel;

        void power() {
            power = !power;
        };

        void channelUp() {
            ++channel;
        }

        void channelDown() {
            --channel;
        }
    }
}
