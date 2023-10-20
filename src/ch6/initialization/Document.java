package ch6.initialization;

public class Document {
    static int count = 0;
    String name;

    public Document() {
        this("제목없음" + ++count);
    }

    public Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}
