package practice.smallstudygrup.datetime;

import java.time.LocalDateTime;

public class C03_dateTime {
    /*
       soru 3)
       bize bugunun tarihini ve su anki saati dondurun
       bize 3 ay 100 saat sonraki tarih ve saati dondurun
       bize 100 gun once 100 saat sonraki tarihi dondurun
       bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
       bize sadece bugunun tarihi dondurun
        */
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2023-04-28T17:51:44.184415800
        System.out.println(tarihSaat.plusMonths(3).plusHours(100));//2023-08-01T21:51:44.184415800
        System.out.println(tarihSaat.minusDays(100).plusHours(100));//2023-01-22T21:52:37.762900900
        System.out.println(tarihSaat.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());//THURSDAY
        System.out.println(tarihSaat.toLocalDate());//2023-04-28 burada sadece tarih kismini aliyor
        System.out.println(tarihSaat.toLocalTime());//17:55:17.711608900 burada sadece saat kismini aliyor.
    }

}