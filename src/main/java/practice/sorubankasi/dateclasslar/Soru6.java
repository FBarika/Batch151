package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Soru6 {
    /*
    6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
olarak hesaplayınız.
     */
    public static void main(String[] args) {
        LocalDate beyza =LocalDate.of(2020,10,12);
        LocalDate barika=LocalDate.of(1992,7,15);
        long fark= ChronoUnit.DAYS.between(barika,beyza);
        System.out.println(fark);
    }
}
