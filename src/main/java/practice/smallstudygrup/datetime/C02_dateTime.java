package practice.smallstudygrup.datetime;

import java.time.LocalTime;

public class C02_dateTime {
    /*
       soru 2)
      -suanin saatini dakikasini ve saniyesini bize dondurun
      -suanin saniyesini bize dondurun
      -10000 saniye sonrasini bize dondurun
      -200 dakika onceki saati bize dondurun
      -bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        */
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);//17:46:49.336273800
        System.out.println(saat.getSecond());//1
        System.out.println(saat.plusSeconds(10000));//20:34:19.528237500
        System.out.println(saat.minusMinutes(200));//14:28:20.433416200
        System.out.println(saat.withHour(3));//03:49:16.578674300 saati saati 3 yapiyor diger dakika saniye ayni kaliyor.



    }
}
