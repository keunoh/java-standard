package overriding;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }

    static class Parent {
        int x = 10;
    }

    static class Child extends Parent {
        void method() {
            System.out.println("x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("super.x=" + super.x);
        }
    }
}




