package practice.sorubankasi.datetimeclasslar;

import java.time.LocalDateTime;

public class Soru1 {
    public static void main(String[] args) {
        /*
        1) Eğer saat
i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
         */
        LocalDateTime simdikiSaat =LocalDateTime.now();
        int saat= simdikiSaat.getHour();
        if(saat>0 && saat<5){
            System.out.println("Uyku zamanı");
        }else if(saat>8 && saat<16){
            System.out.println("Çalışma zamanı");
        } else if (saat>19 && saat<22) {
            System.out.println("Aile zamanı");
        }else{
            System.out.println("Kişisel zaman");
        }


    }
}
