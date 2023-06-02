package javaders.day06typecastingstringmanipulation;

import java.util.Locale;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Tek*Rakibim Dunku Ben* ";
        //***************toUpperCase()***************\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);//aUpper = TEK RAKIBIM DUNKU BEN .

        //***************toLowerCase()***************\\

        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);//aLower = tek rakibim dunku ben .

        //***************charAt(0)***************\\
        System.out.println("ilk karakter = " + (a.charAt(0)));//ilk karakter = T
        System.out.println("onuncu karakter = " + (a.charAt(10)));//onuncu karakter = m

        // a String indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.

        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(21);
        System.out.println(" " + firstChar + lastSecondChar);// araya space koyup string attik.
        //basa String atip resim gibi yazdirabiliriz System.out.println(firstChar + secondChar);seklinde
        // yaparsak parantez icinde toplama islemi oldugu icin ascii degerleri topluyor.

        //***************length()***************\\
        // a String inde bulunan karakter sayisini bulunuz.
        int harfSayisi = a.length();
        System.out.println("harfSayisi = " + harfSayisi);//harfSayisi = 23
        //veya
        System.out.println("karakter sayisi = " + a.length());//karakter sayisi = 23

        //***************substring()***************\\
        // a String indeki ilk 4 karakteri aliniz.
        String ilkDörtKarakter = a.substring(0, 4);// 0 dahil 4 haric [0,4)
        System.out.println("ilkDörtKarakter = " + ilkDörtKarakter);//ilkDörtKarakter = Tek*

        // a String indeki 4.index dahil 7. index haric yazdiriniz.
        System.out.println("a.substring(4,7) = " + a.substring(4, 7));//a.substring(4,7) = Rak

        // a String indeki "Rakib" kelimesini aliniz.
        System.out.println("a.substring(4,9) = " + a.substring(4, 9));//a.substring(4,9) = Rakib

        System.out.println("a.substring(10) = " + a.substring(10));// bir tane index girersek bu index den iti
        //baren bütün datalari yazdirir.//a.substring(10) = m Dunku Ben*

        //a String inde "bim" kelimesinin olup olmadigini kontrol ediniz.

        //***************a.contains()***************\\

        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi);//varMi = true

        //***************starsWith()***************\\

        // a String inin "T" harfi ile baslayip baslamadigini kontrol ediniz.

        boolean varMi1=a.startsWith("T");//varMi1 = true
        System.out.println("varMi1 = " + varMi1);

        boolean varMi2=a.startsWith("Rak",4);//varMi2 = true// ikili olan ilk dort karakteri at Rak ile basliyor mu? kontrol ediyor.
        // sayarken 0 diye baslamicaz 1 2 3 diye sayip aticaz karakterleri
        System.out.println("varMi2 = " + varMi2);
        // prefix baslangic offset: at gitsin

        // Üniversite numaralari yil + bölümKodu + GirisSirasi olarak düzenlenen bir okulda ögrenci Ümran in
        // hukuk fakültesinde okuyup okumadigini gösteren kodu yaziniz

        /* kodlar
        sinif 22   Hukuk 33     bilgisayar 44   Eczacilik 55    Maliye 66 Kimya mühendisligi 77 olsun
         */

        String str ="20105501";
        System.out.println(str.startsWith("55", 4));// true
        System.out.println(str.startsWith("33",4));//false

        System.out.println(a.endsWith(" "));// a string inin sonu boslukla bittigi icin true.burada hiclik de koysakdik tirmak icine true dömdürecekti.


    }//main
}//class
