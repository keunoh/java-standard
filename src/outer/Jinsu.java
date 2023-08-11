public class Jinsu {
    public static void main(String[] args) {

        int value;
        int toJinsu = 8;
        int changingValue = value = 816;

        StringBuilder sb = new StringBuilder();

        while (changingValue / toJinsu > 0) {
            sb.append(changingValue % toJinsu);
//            System.out.print(value % toJinsu + " ");
            changingValue = changingValue / toJinsu;

            if (changingValue / toJinsu == 1) {
                sb.append(changingValue % toJinsu);
                sb.append(1);
//                System.out.print(value % toJinsu + " " + 1);
                break;
            }
        }

        sb.reverse();
        System.out.println(value + "(10) -> " + sb + "(" + toJinsu + ")");
    }
}
