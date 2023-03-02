package generics;

class Juice2 {
    String name;

    Juice2(String name) { this.name = name; }
    public String toString() { return name + "Juice!"; }
}

class Juicer2 {
    static <T extends Fruit> Juice2 makeJuice(FruitBox<T> box) {
        String tmp = "";
        for(Fruit f : box.getList()) tmp += f + " ";
        return new Juice2(tmp);
    }
}


class FruitBoxEx5 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer2.<Fruit>makeJuice(fruitBox));
        System.out.println(Juicer2.<Apple>makeJuice(appleBox));
    }
}
