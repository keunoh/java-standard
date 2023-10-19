package ch6.method;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

        /**
         * 1. copy메서드를 호출하면서 참조변수 d의 값이 매개변수 d에 복사된다.
         * 2. 새로운 객체를 생성한 다음, d.x에 저장된 값을 tmp.x에 복사한다.
         * 3. copy메서드가 종료되면서 반환한 tmp의 값은 참조변수 d2에 저장된다.
         * 4. copy메서드가 종료되어 tmp가 사라졌지만, d2로 새로운 객체를 다룰 수 있다.
         */
    }

    private static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
