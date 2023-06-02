package javaders.day22stringbuilder;

public class Sb01 {
    /*
    1)StringBuilder String üreten bir class tir.
    2)String class kullanarak String üretiriz. Java nicin StringBuilder class i da olusturdu?
      String class "immutable" String üretir."StringBuilder" class "mutable"(degistirilebilir) String üretir.
    3)"immutable" olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir.
      "mutable" olmak demek orijinal degerin degistirilebilir olmasi demektir.
    4)Capacity Java nin size verdigi data depolama yer sayisidir.Length ise size verilen data depolama yerinin kullanilan kismidir.
    5)Java baslangic olarak size capatiy i 16 olarak verir. Siz verilen capacity i asarsaniz Java yeni capacity varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.

     */
    public static void main(String[] args) {

        String s ="Java";
        //s=s+"!"; bu sekilde normal String lerde atama yaparak orjinal deger degistiriliyor.
        String u = "Apex";
        String v = "Apex";
        String y = "C++";
        //StringBuilder nasil olusturulur?
        StringBuilder t = new StringBuilder("Python");

        //Nasil yazdirilir?
        System.out.println(t);

        //StringBuilder a nasil ekleme yapilir?
        t.append("!").append("...");//metthod chain method zinciri.
        System.out.println(t);//Python!... atama yapmadan direkt orijinal degeri degistirdik.

        //2.Way
        StringBuilder r = new StringBuilder();
        System.out.println(r);// burada hicbir sey yazdirmaz.
        r.append('c');
        System.out.println(r);//c

        //"capacity" ve "length" arasindaki fark nedir?

        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println(capacity);//21

        int lenght = sb1.length();
        System.out.println(lenght);//5

        sb1.append("!").append(".................");//44==21x2+2=44

        int c =sb1.capacity();
        System.out.println("sonuc"+c);//44 capacity ayni cunku append ile ekledigimizi capacity inin icine ekliyor.

        int ln=sb1.length();
        System.out.println(ln);//23

        //Default capacity i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());

        sb2.append("...");
        System.out.println(sb2.capacity());//6 varolanin(2) katinin 2 fazlasi oldu.














    }//main
}//class
