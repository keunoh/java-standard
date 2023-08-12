package ring;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(1);
    }
}

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        this.value = x;
    }
}
