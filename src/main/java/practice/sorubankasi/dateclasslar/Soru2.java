package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Soru2 {
    public static void main(String[] args) {
        /*
        2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
Ali'nin doğum tarihi 4 Haziran 1997'dir.
        */
        LocalDate now = LocalDate.now();
        LocalDate alininDogumGünü=LocalDate.of(1997,6,4);
        long ay=ChronoUnit.MONTHS.between(alininDogumGünü,now);
        System.out.println(ay);



    }
}
