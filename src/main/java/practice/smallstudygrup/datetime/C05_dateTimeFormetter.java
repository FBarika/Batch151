package practice.smallstudygrup.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_dateTimeFormetter {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("mm:hh a d/MMMM/y"); //araya 'a' koyunca PM oluyor.

        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(dtf.format(bugun));
    }
}