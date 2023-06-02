package practice.sorubankasi.datetimeclasslar;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Soru5 {
    /*
    5) Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
doğum tarihi ve saati nedir?
     */
    public static void main(String[] args) {
        LocalDateTime TokyodakiSimdikiTarih = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime GMTdekiSimdikiTarih = LocalDateTime.now(ZoneId.of("GMT"));
        long saatFarki = ChronoUnit.HOURS.between(GMTdekiSimdikiTarih, TokyodakiSimdikiTarih);
        System.out.println(saatFarki);//9
        LocalDateTime dogumTrhMark = LocalDateTime.of(2018, 2, 23, 15, 25, 0).minusHours(saatFarki);
        System.out.println("Tokyo daki dogum tarihi : " + dogumTrhMark);
    }
}
