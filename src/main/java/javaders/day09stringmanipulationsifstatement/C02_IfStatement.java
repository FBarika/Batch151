package javaders.day09stringmanipulationsifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*
        If Statement () yapisi bazen kodlarin calismasi belirli kosullara baglidir.
        Mesela cok calirsam Java ögrenecegim. Java ögrenme eylemi cok calisma eylemine baglanmistir.
        1. eylem gerceklesmeden 2. eylem gerceklesmez.

        if(){}
        () parantez icinde sart yazilir eger true döndürürse {} body arasindaki kod calisir.
        Aksi halde if body disina cikar class ta sonraki kodlari okumaya devam eder.

         */

        // INTERWIEW QUESTIONS USA QA
        // String str ="abbccdc" tekrarsiz karakterleri ekrana yazdiriniz.

        // String str ="aac" tekrarsiz karakterleri ekrana yazdiriniz. soru uzamasin diye aac yaptik
        String str ="aac";
        char ch= str.charAt(0);
        if(str.indexOf(ch)==str.lastIndexOf(ch)) {
            System.out.println(ch);
        }//if body

        char ch1 =str.charAt(1);
        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }//if body

       char ch2 = str.charAt(2);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);     // ekranda c yazdirir.
        }//if body

        //Ex: Sayi pozitif ise ekrana "Pozitif Sayi" yazdiran kodu yaziniz.

        int num = 20;
        if (num>0){
            System.out.println("pozitif sayi");//pozitif sayi
        }
        System.out.println("***********");//********* yazdirir ekranda

        //Ex: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz.
        //0 1 2 3 4 5 6 7 8 9 ==> Rakam

        // scanner li
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi1= input.nextInt();

        if (sayi1>-1 && sayi1<10){
            System.out.println("Sayı rakamdır"); //rakam yamazsak hicbir sey yazdirmiyor ekranda
        }
        // scanner siz cevap
        int exnum = 3;

        if(exnum>-1 && exnum<10){
            System.out.println("Rakam");
        }


        // Ex: Sayi üc basamakli ise ekrana "Sayi 3 basamaklidir" yazdiriniz.

        /* 1) yol
        int number2 = -123;
        if(number2>99 && number2<1000 || number2>-1000 && number2<-99){
            System.out.println("Sayi 3 Basamaklidir"); //Sayi 3 Basamaklidir
        }
         */
        int n= -234;
        /*
        Math class i önemli bir class tir. Icerisinde bircok method barindirir.
        abs() methodu da icerisine arguman olarak verilen sayinin mutlak degerini yani pozitif halini verir.
        min() methodu iki sayidan  minimum olani verir.
         */
        n =Math.abs(n);
        if(n>99 && n<1000) {
            System.out.println("Sayi 3 basamaklidir");
        }

        System.out.println("*******************");
        System.out.println("Math.min(5,9) = " + Math.min(5, 9));//5 // ek bilgi

    }//main
}//class
