package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Practice1 {
    //스트림을 사용한 코드가 간결하고 이해하기 쉬우며 재사용성도 높다
    public static void main(String[] args) {
        String[] strArr = {"aaa", "ddd", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        //위의 두 데이터 소스를 기반으로 하는 스트림
        Stream<String> strStream1 = strList.stream();       //스트림을 생성
        Stream<String> strStream2 = Arrays.stream(strArr);  //스트림을 생성

        //두 스트림으로 데이터 소스의 데이터를 읽어서 정렬하고 화면에 출력
        //데이터 소스가 정렬되는 것이 아님에 유의
        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

        //아래는 예전의 방식
        Arrays.sort(strArr);
        Collections.sort(strList);
        for (String str : strArr)
            System.out.println(str);
        for (String str : strList)
            System.out.println(str);

        //정렬된 결과를 새로운 List에 담아서 반환한다.
        List<String> sortedList = strStream2.sorted().collect(Collectors.toList());

        //스트림은 일회용이다.
        strStream1.sorted().forEach(System.out::println);
//        int numOfStr = strStream1.count();  //에러 : 스트림이 이미 닫혔음.
    }
}
