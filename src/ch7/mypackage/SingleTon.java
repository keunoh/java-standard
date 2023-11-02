package ch7.mypackage;

public class SingleTon {
    private static SingleTon s = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (s == null)
            s = new SingleTon();
        return s;
    }
}
