package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;

public class Soru3 {
    /*
    3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
sonraki tam tarihi bulmak için kodu yazınız.
     */
    public static void main(String[] args) {
        LocalDate AliDogumyeniTarih = LocalDate.of(1997,6,4).plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(AliDogumyeniTarih);
    }
}
