package ch6.method;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("CallStackTest2.main.start");
        firstMethod();
        System.out.println("CallStackTest2.main.terminate");
    }

    private static void firstMethod() {
        System.out.println("CallStackTest2.firstMethod.start");
        secondMethod();
        System.out.println("CallStackTest2.firstMethod.terminate");
    }

    private static void secondMethod() {
        System.out.println("CallStackTest2.secondMethod.start");
        System.out.println("CallStackTest2.secondMethod.terminate");
    }
}
