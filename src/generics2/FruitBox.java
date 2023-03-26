package generics2;


import java.util.ArrayList;

public class FruitBox {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }

    static class Fruit {
        public String toString() {
            return "Fruit";
        }
    }

    static class Apple extends Fruit {
        public String toString() {
            return "Apple";
        }

        static class Grape extends Fruit {
            public String toString() {
                return "Grape";
            }
        }
    }

    static class Toy {
        public String toString() {
            return "Toy";
        }
    }

    static class Box<T> {
        ArrayList<T> list = new ArrayList<>();

        void add(T item) {
            list.add(item);
        }

        T get(int i) {
            return list.get(i);
        }

        int size() {
            return list.size();
        }

        public String toString() {
            return list.toString();
        }
    }
}
