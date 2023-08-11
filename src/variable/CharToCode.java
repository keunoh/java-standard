package variable;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = ch;

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = 'a';

        System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);
    }
}
