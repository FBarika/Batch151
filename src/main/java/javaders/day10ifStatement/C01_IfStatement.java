package javaders.day10ifStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        //If it rain;I will cancel the picnic.
        // Eger yagmur yagarsa; piknigi iptal edecegim.

        // Ex: Verilen bir karakterin buyuk harf ise ekrana
        // "Buyuk Harf " yazdiran kodu yaziniz"

        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') { // + - * < > gibi matematiksel islemler oldugunda char ascii table daki karsiliklarina göre islem yapilir.
            System.out.println("Büyük Harf");

        }
        //Verilen sayi cift sayi ise ekrana "cift Sayi" yazdiran kodu yaziniz.
        byte sayi = 12;
        //KARSILASTIRMA OPERATÖRLERI:< Kucuktur
        //> Buyuktur
        //== Esittir
        //!= Esit degildir
        //<= Kucuk esittir
        //>= Buyuk esittir
        //&& and (ve) operatoru
        //|| or (veya) operatoru
        // kodun dinamik yazilmasi icin variable ismi yazilir. Direk deger yazilirsa hurd coding yani tek datalik kod olur.

        //Verilen sayi cift sayi ise ekrana "cift Sayi" yazdiran kodu yaziniz.
        byte sayi1 = 12;
        if (sayi % 2 == 0) {

            System.out.println("Cift Sayi");
        }
        //Ex: Verilen bir sayi 300 den kucuk veya 1200 den büyük ise "Harika Sayi" yazdiran kodu yaziniz.

        int sayi2 = 30;
        if (sayi2 < 300 || sayi2 > 1200) {
            System.out.println("Harika Sayi " + sayi2);
        }
        //Ex:  Kullanicidan alinan datanin tek mi cift mi yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int number = input.nextInt();
        // 1. Yol bagimsiz if Statement.
        if (number % 2 == 0) {
            System.out.println("cift sayi");

        }//if body cift
        if (number % 2 != 0) {
            System.out.println("Tek sayi");

        }//if body tek

        //2. Yol If Else
        if (number % 2 == 0) {   // Eger num icerisindeki datanin 2 ye bölümünden kalan 0'a esitse "cift sayi" yazdirir.
            System.out.println("cift sayi");

        } else {  // else = degilse demek geriye kalan tüm ihtimaller icin burasi calisir.
            System.out.println("Tek Sayidir");
        }

        // Ex: Verilen bir sayinin negatif mi, pozitif mi oldugunu söyleyen  kodu yaziniz.
        int a =0;
        if(a>0){
            System.out.println("pozitif");
        }else if(a<0){
            System.out.println("negatif");
        }else{
            System.out.println("nötr");
        }//benim cözümüm

        int numara = 0;
        if (numara < 0) {
            System.out.println("Negatif Sayi");
        } else if (numara == 0) {
            System.out.println("Nötr Sayi");
        } else {
            System.out.println("Pozitif Sayi");

        }


    }//main
}//class
