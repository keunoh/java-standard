package ch7.abstractinterface;

public class InterFaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }

    interface I {
        public abstract void methodB();
    }

    static class A {
        public void methodA() {
            I i = InstanceManager.getInstance();
            i.methodB();
            System.out.println("i.toString() = " + i.toString());
        }
    }

    static class B implements I {
        @Override
        public void methodB() {
            System.out.println("B.methodB");
        }

        @Override
        public String toString() {
            return "B{}";
        }
    }

    static class InstanceManager {
        public static I getInstance() {
            return new B();
        }
    }
}
