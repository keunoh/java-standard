package outer;
import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("갈람숑 (1), (2), (3)");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("you lose");
                break;
            case 1:
            case -2:
                System.out.println("you win");
                break;
            case 0:
                System.out.println("same same");
        }
    }
}
