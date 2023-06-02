package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Soru11 {
    public static void main(String[] args) {
        /*
        10) İki farklı tarih için saat farkını bulunuz
         */
        LocalDate beyza=LocalDate.of(2020,10,12);
        LocalDate barika=LocalDate.of(1992,7,15);
        long saatFarki= ChronoUnit.HOURS.between(beyza,barika);
        System.out.println(saatFarki);
    }
}
