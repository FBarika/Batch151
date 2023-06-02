package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;

public class Soru8 {
    public static void main(String[] args) {
        /*
        7) Belirli bir tarihte yılın son 2 hanesini alınız
         */
        LocalDate bugün = LocalDate.now();
        int sayi=bugün.getYear()%100;
        System.out.println(sayi);//23
    }
}
