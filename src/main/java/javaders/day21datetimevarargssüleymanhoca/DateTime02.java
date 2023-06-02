package javaders.day21datetimevarargssüleymanhoca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-03-16T20:03:28.059929800

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - HH:mm: a");
        String formattedLdt= dtf1.format(ldt);
        System.out.println(formattedLdt);// 3/21/2023 - 14:30 nachm.

    }//main
}//class
