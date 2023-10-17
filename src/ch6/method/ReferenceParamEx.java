package ch6.method;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main : d.x = " + d.x);

        change(d);
        System.out.println("after change(d.x)");
        System.out.println("main : d.x = " + d.x);
    }

    private static void change(Data d) {
        d.x = 1000;
        System.out.println("change : x = " + d.x);
    }
}
