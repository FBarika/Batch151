package practice.b151practices.day10practice;

import java.sql.SQLOutput;

public class C03_Instance {
    /*
    instance variable main method disinda olusturuyoruz. Instance variablelar object ile cagrilir
    instance variablelara deger atayabiliriz, atamayabiliriz de.instance variable lara deger atamazsak default degeri elinde tutar.
    int, short, long, double, float icin 0 olur
    char icin de 0 verir

    Instance variable lari static method(main de static) icinde kullanabilmek icin obje olusturarak cagirmak gerekiyor.
     */

    int sayi;// default deger burada 0 dir.
    String bransIsmi="Java";
    boolean okuldaMi; //boolean in default degeri false dur.

    //bunlarin instance oldugunu static yazmadigi icin anladik ve main methodun disinda olusturulmus.

    public static void main(String[] args) {
        /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım
        */

        C03_Instance obj1  =new C03_Instance();
        System.out.println(obj1.sayi);//0
        System.out.println(obj1.bransIsmi);//Java
        System.out.println(obj1.okuldaMi);//false

        //instance variable lar obje ye baglidir hangi obje üzerinden variable da degisiklik yapildiysa yapilan bu degisiklik sadece o objeyi baglar.

        obj1.sayi=10;
        System.out.println(obj1.sayi);//10

        C03_Instance obj2=new C03_Instance();
        System.out.println(obj2.sayi);//0

        obj1.bransIsmi="SQL";
        System.out.println(obj1.bransIsmi);//SQL

        System.out.println(obj2.bransIsmi);//Java
        System.out.println(obj1.okuldaMi);//false

        obj1.okuldaMi=true;
        System.out.println(obj1.okuldaMi);//true

        System.out.println(obj2.okuldaMi);//false

        obj2.sayi=100;
        System.out.println(obj2.sayi);//100

        obj2.bransIsmi="API";
        System.out.println(obj2.bransIsmi);//API




    }
}
