package ch7.mymodifier;

public class StaticTest {
    static int width = 200;
    static int height = 120;

    // static 초기화 블럭은 클래스가 메모리에 로드될 때 단 한번만 수행되며,
    // 주로 클래스변수(static 변수)를 초기화하는데 주로 사용된다.
    static {
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
