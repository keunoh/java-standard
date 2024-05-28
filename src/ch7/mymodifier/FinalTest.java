package ch7.mymodifier;

/**
 * final 이 사용될 수 있는 곳 - 클래스, 메서드, 멤버변수, 지역변수
 * 대표적인 final 클래스로는 String 과 Math 가 있다.
 */
final class FinalTest {         // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10;    // 값을 변경할 수 없는 멤버변수 (상수)

    final int getMaxSize() {
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}
