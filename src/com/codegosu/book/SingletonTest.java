package com.codegosu.book;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
        Singleton s2 = Singleton.getInstance();
    }

}
final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}