package practice.sorubankasi.datetimeclasslar;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Soru4 {
    /*
    4) Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de
doğmuştur. Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
     */
    public static void main(String[] args) {
        LocalDateTime aliDogum =LocalDateTime.of(2015,2,5,10,15,0);
        LocalDateTime veliDogum=LocalDateTime.of(2015,3,6,12,25);
        long fark= ChronoUnit.HOURS.between(aliDogum,veliDogum);
        System.out.println(fark);
    }
}
