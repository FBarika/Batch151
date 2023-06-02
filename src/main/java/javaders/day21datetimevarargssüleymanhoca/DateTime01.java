package javaders.day21datetimevarargssüleymanhoca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);//19:04:16.712296300

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//19

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//6

        int second =myCurrentTime.getSecond();
        System.out.println(second);//31

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//712296300

        //Gelecek ve gecmis zamana nasil gidilir?

        LocalTime next= myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);//sadece dakika ve saniyeyi degistiriyor.

        //Zaman formati nasil degistirilir?
        //"HH" 24 luk saat sistemini "hh" 12 lik saat sistemini kullanir.
        //"hh:mm a" ifadesindeki "a" 12 lik saat sisteminde "AM", "PM" yazilmasini saglar.
        //"ss" saniyeyi gösterir.
        //"mm" minute demektir."MM" month demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");//

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println("formattedMyCurrentTime = " + formattedMyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yy");

        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08/25/22

        //Tarihi Gun/Ay isminin ilk 3 harfi/Yil  sekline ceviriniz.
        DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Aug./22

        //Tarihi Gun/Ay ismi/Yil sekline ceviriniz. 25/August/2022
        DateTimeFormatter dtf4 =DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/August/22

        //Baska bir zaman dilimindeki tarih ve zamani nasi aliriz?

        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-17

        LocalDate dateInTashkent =LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);

        // Tokyo da saat kac?
        LocalTime timeInTikyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTikyo);//03:47:35.447813900

        //Berlin da saat kac

        LocalTime timeInBerlin=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);
























    }//main
}//class
