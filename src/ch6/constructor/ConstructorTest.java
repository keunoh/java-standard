package ch6.constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // compile error 발생
        Data2 d2 = new Data2(1);
    }
}
