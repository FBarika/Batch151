package practice.sorubankasi.datetimeclasslar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class Soru2 {
    public static void main(String[] args) {
        /*
        2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
         */

        LocalDateTime Japonya =LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime Almanya =LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long fark =ChronoUnit.HOURS.between(Almanya,Japonya);
        System.out.println(fark);//bunu sor neden long un icine koymak zorunda kaliyoruz.?????????????????















































    }//main
}//class
