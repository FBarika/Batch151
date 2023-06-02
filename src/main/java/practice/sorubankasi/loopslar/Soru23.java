package practice.sorubankasi.loopslar;

import java.util.Scanner;

public class Soru23 {
    /*
    23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
yönlendiriniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();
        int counter = 0;
        if (sayi > 0) {

            if (sayi == 1 || sayi == 2) {
                System.out.println("asal");
            } else if (sayi > 2) {
                for (int i = sayi; i > 2; i--) {
                    if (sayi % (i - 1) == 0) {
                        counter++;
                    }
                }
            }
            if (counter == 0) {
                System.out.println("asal");
            } else if (counter > 0) {
                System.out.println("asal degil");

            }
        } else {
            System.out.println("Lütfen pozitif bir sayi giriniz");
        }
    }
}