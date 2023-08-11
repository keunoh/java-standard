package outer;
public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작됨.");
        firstMethod();
        System.out.println("main(String[] args)이 끝남.");
    }

    static void firstMethod() {
        System.out.println("CallStackTest2.firstMethod 시작");
        secondMethod();
        System.out.println("CallStackTest2.firstMethod 끝");
    }

    static void secondMethod() {
        System.out.println("CallStackTest2.secondMethod 시작");
        System.out.println("CallStackTest2.secondMethod 끝");
    }
}
