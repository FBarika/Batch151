package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;

public class Soru10 {
    public static void main(String[] args) {
        /*
        9) İki farklı tarihin ay numaralarının toplamını bulunuz.
         */
        LocalDate beyza=LocalDate.of(2020,10,12);
        LocalDate barika=LocalDate.of(1992,7,15);
        int toplam = beyza.getMonthValue()+barika.getMonthValue();
        System.out.println(toplam);//17
    }
}
