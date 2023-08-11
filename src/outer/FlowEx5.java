package outer;
import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.print("점수 입력하셈 -> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("님의 점수는 " + score + " 이오!");

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("학점은 ... %c%c%n", opt, grade);
    }
}
