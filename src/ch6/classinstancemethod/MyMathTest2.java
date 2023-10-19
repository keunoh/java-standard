package ch6.classinstancemethod;

public class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println("mm.add() = " + mm.add());
        System.out.println("mm.subtract() = " + mm.subtract());
        System.out.println("mm.multiply() = " + mm.multiply());
        System.out.println("mm.divide() = " + mm.divide());
    }
}
