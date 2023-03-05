package exception2;

public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1()의 수행을 마치고 main 메서드로 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            //return 문을 만나도 finally 블록의 문장들은 수행된다.
            return; //현재 실행중인 메서드를 종료한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally 블록이 실행되었습니다.");
        }
    }
}
