package ch7.myimport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("date = " + date.format(today));
        System.out.println("time = " + time.format(today));
    }
}
