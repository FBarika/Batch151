package practice.sorubankasi.ifstatementlar;

import java.util.Scanner;

public class Soru8 {
    /*
    8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
yazmalıdır.

     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen eyalet ismini kisaltilmis haliyle giriniz");
        String s= input.next();
        if(s.length()>2){
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        }
        if(s.replaceAll("[^a-z]","").length()>0){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
        }
        if(s.replaceAll("[^a-zA-Z]","").length()>0){
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez\n"+"A dan Z ye ");
        }
    }
}
