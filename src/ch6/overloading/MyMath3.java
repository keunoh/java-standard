package ch6.overloading;

public final class MyMath3 {
    int add(int a, int b) {
        System.out.printf("add(int a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.printf("long add(int a, long b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.printf("long add(long a, int b)");
        return a + b;
    }

    long add(long a, long b) {
        System.out.printf("long add(long a, long b)");
        return a + b;
    }

    int add(int[] a) {
        System.out.printf("int add(int[] a)");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
