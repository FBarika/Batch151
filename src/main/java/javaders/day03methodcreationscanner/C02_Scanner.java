package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin tplamini ekrana yazdiran programi yaziniz.

        // %==> Modulus operatoru sayinin bolumunden kalan sayiyi verir. "/" bölme islemi bölümü verir.

        Scanner input= new Scanner (System.in);
        System.out.println("Lütfen 4 basmakli bir sayi giriniz");
        int sayi =input.nextInt();//8649
        int sonRakam =sayi%10;
        int ilkRakam =sayi/1000;
        System.out.println("ilkRakam+sonRakam = " + (ilkRakam+sonRakam));
        /* 4 basamakli bir sayinin ilk basmagini almak icin (basamak sayisi -1) 0 olan yani 1000 e bölmeliyiz
           3 basamakli bir sayinin ilk basmagini almak icin (basamak sayisi -1) 0 olan yani 100 e bölmeliyiz
           5 basamakli bir sayinin ilk basmagini almak icin (basamak sayisi -1) 0 olan yani 10000 e bölmeliyiz

         */





    }//main
}//class
