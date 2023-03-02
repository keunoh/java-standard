package generics;


public class FruitBoxEx6 {
    public static void main(String[] args) {
        Box box = null;
        Box<Object> objBox = null;

        box = (Box) objBox;         //OK. 지네릭 타입 -> 원시 타입. 경고발생
        objBox = (Box<Object>) box; //OK. 원시 타입 -> 지네릭 타입. 경고발생
    }
}

class test {
    public static void main(String[] args) {
        Box<Object> objBox = null;
        Box<String> strBox = null;

//        objBox = (Box<Object>) strBox; //에러. Box<String> -> Box<Object>
//        strBox = (Box<String>) objBox; //에러. Box<Object> -> Box<String>
        Box<? extends Object> wBox = new Box<String>(); //OK. 다형성

        FruitBox<? extends Fruit> box1 = new FruitBox<Fruit>(); //OK
        FruitBox<? extends Fruit> box2 = new FruitBox<Apple>(); //OK
        FruitBox<? extends Fruit> box3 = new FruitBox<Grape>(); //OK

        FruitBox<? extends Fruit> box4 = null;
        //OK. 미확인 타입으로 형변환 경고
        FruitBox<Apple> appleBox = (FruitBox<Apple>) box4;
    }
}
