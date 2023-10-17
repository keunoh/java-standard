public class Main {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hi";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("hello");
        String s4 = "hello";

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = new String("java");
        String s6 = new String("java");

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}