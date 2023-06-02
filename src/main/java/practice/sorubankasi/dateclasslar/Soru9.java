package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;

public class Soru9 {
    public static void main(String[] args) {
        /*
        8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
Artık Yıl:
i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900
değildir.
ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007
değildir.
         */
        LocalDate dogum=LocalDate.of(1992,7,15);
        boolean r1=dogum.isLeapYear();
        System.out.println("Artik yil mi?= "+r1);
    }
}
