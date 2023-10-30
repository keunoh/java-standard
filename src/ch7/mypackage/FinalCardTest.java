package ch7.mypackage;

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
//        c.NUMBER = 5;
        System.out.println("c.KIND = " + c.KIND);
        System.out.println("c.NUMBER = " + c.NUMBER);
        System.out.println("c = " + c);
    }

}
