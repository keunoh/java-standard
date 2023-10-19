package ch6.recursivecall;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);
        int result2 = factorial2(4);

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }

    private static int factorial(int n) {
        int result = 0;

        if (n == 1)
            result = 1;
        else
            result = n * factorial(n - 1);

        return result;
    }

    private static int factorial2(int n) {
        int result = 1;
        while(n != 0)
            result *= n--;
        return result;
    }
}
