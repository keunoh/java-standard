package ch6.oop;

public final class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
