package ch7.mypackage;

public class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    public Card( String KIND, int NUMBER) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    public Card() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}
