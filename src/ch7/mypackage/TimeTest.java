package ch7.mypackage;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(20, 30, 1);
        System.out.println("t = " + t);
//        t.hour = 13;
        t.setHour(t.getHour() + 1);
        System.out.println("t = " + t);
    }

}
