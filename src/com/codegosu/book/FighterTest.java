package com.codegosu.book;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("Son of Unit");
        if (f instanceof Fightable)
            System.out.println("implements Fightable");
        if (f instanceof Movable)
            System.out.println("implements Movable");
        if (f instanceof Attackable)
            System.out.println("implements Fightable");
        if (f instanceof Object)
            System.out.println("extends Object");
    }
}

class Fighter extends Unit implements Fightable {
    @Override
    public void move(int x, int y) {
        System.out.println("My life for Aiur!");
    }

    @Override
    public void attack(Unit u) {
        System.out.println("This good day to die!");
    }
}
class Unit {
    int currentHP;
    int x;
    int y;
}
interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit u);}
