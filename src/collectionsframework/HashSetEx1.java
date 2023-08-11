package collectionsframework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", Integer.valueOf(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        Collections.addAll(set, objArr);

        //HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);
    }
}
