package practice.b151practices.day11practice;

import practice.b151practices.day10practice.C03_Instance;

public class C01_Instance {
    int sayi;//0

    String isim;// null

    boolean ogrenciMi;//false

    public static void main(String[] args) {
         /*

    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

         */

        C01_Instance obj1 =new C01_Instance();
        System.out.println(obj1.sayi);
        System.out.println(obj1.isim);
        System.out.println(obj1.ogrenciMi);




        C01_Instance obj2=new C01_Instance();
        obj1.isim="Hasan";
        obj2.isim="Hüseyin";
        System.out.println(obj1.isim);//Hasan

        obj1.sayi=20;
        obj2.sayi=25;

        System.out.println(obj2.sayi);//25
        System.out.println(obj1.sayi);//20

        //instance variable lar objeye baglidir
        //hangi obje üzerinden degisiklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.


    }
}
