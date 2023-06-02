package practice.sorubankasi.stringmanipulationslar;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        /*
        16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
Not: İkinci isim kapsam dışındadır.
Örnek: Tom Hanks ==> TH, Mary Star ==> MS
         */
        Scanner input=new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz");
        String s=input.nextLine().toUpperCase();
        String a1=s.substring(0,1);
        String a2=s.split(" ")[1].substring(0,1);
        System.out.println(a1+a2);
    }
}
