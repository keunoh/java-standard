public class Main {
    public static void main(String[] args) {
        int a = 1000;
        int b = 60;
        int c = 60;
        int d = 6;
        System.out.println(a * b * c * d);
        Runnable hello = () -> System.out.println("hello world!f");
        hello.run();
    }
}