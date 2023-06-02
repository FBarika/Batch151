package practice.sorubankasi.ifstatementlar;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        /*
        6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen mil degerini giriniz.");
        double mil=input.nextDouble();
        System.out.println("Lütfen operatoru giriniz");
        String operator=input.next();
        if(operator.equalsIgnoreCase("mildenKmye")){
            mil=mil*1.6;
            System.out.println(mil+" km");
        }

        System.out.println("Lütfen saniye degerini giriniz");
        int saniye=input.nextInt();
        System.out.println("Lütfen operatoru giriniz");
        String operator1=input.next();
        if(operator1.equalsIgnoreCase("saniyedenSaate")){
            saniye=saniye/3600;
            System.out.println(saniye);
        }

        System.out.println("Lütfen fahrenheit degerini giriniz");
        double fahrenheit=input.nextDouble();
        System.out.println("Lütfen operatoru giriniz");
        String operator2=input.next();
        if(operator2.equalsIgnoreCase("fahrenaytdanSantigarata")){
            fahrenheit=fahrenheit/1.8;
            System.out.println(fahrenheit+" santigrat");
        }




























    }//main
}//class
