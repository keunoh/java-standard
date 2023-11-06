package ch7.instance;

public class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("Child.method");
        System.out.println("this.x = " + this.x);
    }
}
