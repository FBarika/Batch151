package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;

public class Soru7 {
    public static void main(String[] args) {
        //7) Belirli bir tarihte yılın son 2 hanesini alınız.
        LocalDate dogum =LocalDate.of(1992,7,15);
        int sonIkiRakam = dogum.getYear()%100;
        System.out.println(sonIkiRakam);//92
    }
}
