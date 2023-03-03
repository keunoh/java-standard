package exception;

public class ExceptionEx14 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    } //main 메서드의 끝

    private static void method1() throws Exception {
            throw new Exception();
    } // method1의 끝
}
