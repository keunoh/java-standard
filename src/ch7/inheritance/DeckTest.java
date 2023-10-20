package ch7.inheritance;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println("c = " + c);

        d.shuffle();
        c = d.pick(0);
        System.out.println("c = " + c);

        c = d.pick();
        System.out.println("c = " + c);
    }
}
