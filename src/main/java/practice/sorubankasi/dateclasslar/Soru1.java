package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Soru1 {
    public static void main(String[] args) {
     /*
     1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
Ali'nin doğum tarihi 12 Mayıs 2002'dir.
      */
        LocalDate now =LocalDate.now();
        LocalDate dogumGünü =LocalDate.of(2002,5,12);
        long günSayisi= ChronoUnit.DAYS.between(dogumGünü,now);
        System.out.println("Ali nin yasadigi gün sayisi: "+günSayisi);//Ali nin yasadigi gün sayisi: 7627

    }//main
}//class
