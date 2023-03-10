package exception2;

public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall(); //프로그램 설치에 필요한 준비를 한다.
            copyFiles();    //파일들을 복사한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();  //프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall() {}
    static void copyFiles() {}
    static void deleteTempFiles() {}
}
