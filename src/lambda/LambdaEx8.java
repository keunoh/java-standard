package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class LambdaEx8 {
    public static void main(String[] args) {
        Supplier<MyClass> s1 = () -> new MyClass(); //람다식
        Supplier<MyClass> s2 = MyClass::new;        //메서드 참조

        Function<Integer, MyClass> f1 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f2 = MyClass::new;

        BiFunction<Integer, String, MyClass> bf1 = (i, s) -> new MyClass(i, s);
        BiFunction<Integer, String, MyClass> bf2 = MyClass::new;

        Function<Integer, int[]> ff1 = x -> new int[x];
        Function<Integer, int[]> ff2 = int[]::new;
    }
    static class MyClass {

        public MyClass() {
        }

        public MyClass(Integer i){
        }

        public MyClass(Integer i, String s) {
        }
    }
}
