package ch7.abstractinterface;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterFace.staticMethod();
        MyInterFace2.staticMethod();
    }

    static class Child extends Parent implements MyInterFace, MyInterFace2 {
        @Override
        public void method1() {
            System.out.println("Child.method1");
        }
    }
    static class Parent {
        public void method2() {
            System.out.println("Parent.method2");
        }
    }

    interface MyInterFace {
        default void method1() {
            System.out.println("MyInterFace.method1");
        }

        default void method2() {
            System.out.println("MyInterFace.method2");
        }

        static void staticMethod() {
            System.out.println("MyInterFace.staticMethod");
        }
    }

    interface MyInterFace2 {
        default void method1() {
            System.out.println("MyInterFace2.method1");
        }

        static void staticMethod() {
            System.out.println("MyInterFace2.staticMethod");
        }
    }
}
