package practice.sorubankasi.datetimeclasslar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Soru3 {
    /*
    3) Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
nedir?
     */
    public static void main(String[] args) {
        LocalDateTime aliDogum= LocalDateTime.of(2015,2,5,10,0,0);
        ZonedDateTime yerelAli = aliDogum.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime veliDogum = LocalDateTime.of(2015,2,5,12,0,0);
        ZonedDateTime yerelVeli = veliDogum.atZone(ZoneId.of("America/New_York"));
        long saatFarki= ChronoUnit.HOURS.between(yerelAli,yerelVeli);
        System.out.println("saat farki= "+saatFarki);
    }
}
