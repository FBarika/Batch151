package practice.sorubankasi.dateclasslar;

import java.time.LocalDate;

public class Soru5 {
    public static void main(String[] args) {
        /*
        5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.
         */
        LocalDate aliDogum = LocalDate.of(2012,11,24);
        LocalDate veliDogum = aliDogum.minusYears(3).minusDays(11);
        System.out.println(veliDogum);
    }
}
