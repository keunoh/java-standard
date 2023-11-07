package ch7.abstractinterface;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f is son of Unit");
        }

        if (f instanceof Fightable) {
            System.out.println("f is son of Fightable");
        }

        if (f instanceof Movable) {
            System.out.println("f is son of Movable");
        }

        if (f instanceof Attackable) {
            System.out.println("f is son of Attackable");
        }

        if (f instanceof Object) {
            System.out.println("f is son of Object");
        }
    }
}
