package generics;

class Practice1 {
    //지네릭스의 장점
    //1. 타입 안정성을 제공한다.
    //2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.

    public static void main(String[] args) {
        Box2<String> b = new Box2<String>(); //타입 T 대신, 실제 타입을 지정
//        b.setItem(new Object()); //에러. String 이외의 타입은 지정불가
        b.setItem("ABC");
        String itemA = (String) b.getItem();
        String itemB = b.getItem(); //형변환이 필요없음

        //지네릭 도입되기 이전의 코드
        Box2 b2 = new Box2(); //OK. T는 Object로 간주된다.
        b2.setItem("ABC");  //경고. unchecked or unsafe operation
        b2.setItem(new Object()); //경고. unchecked or unsafe operation

        //Object를 명시적으로 타입지정
        Box2<Object> b3 = new Box2<Object>();
        b3.setItem("ABC"); //경고발생 안함
        b3.setItem(new Object()); //경고발생 안함
        //지네릭스가 도입되기 이전의 코드와 호환성을 유지하기 위함일 뿐
        //반드시 타입을 지정해주는 것이 좋다.
    }
}

class Box1 {
    Object item;

    void setItem(Object item) {
        this.item = item;
    }

    Object getItem() {
        return item;
    }
}
//지네릭스 형식으로 바꾸는 경우
class Box2<T> { //지네릭 타입 T를 선언
    T item;

    void setItem(T item) { this.item = item;}
    T getItem() { return item; }
}
