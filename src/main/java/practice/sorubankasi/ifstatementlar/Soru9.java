package practice.sorubankasi.ifstatementlar;

import java.util.Scanner;

public class Soru9 {
    /*
    9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen sirasiyla iki sayi giriniz");
        double sayi1=input.nextDouble();
        double sayi2=input.nextDouble();
        System.out.println("Lütfen operatörü giriniz");
        char ch = input.next().charAt(0);

        if(ch=='+'){
            System.out.println(sayi1+"+"+sayi2+"="+(sayi1+sayi2));
        } else if (ch=='-') {
            System.out.println(sayi1+"-"+sayi2+"="+(sayi1-sayi2));

        } else if (ch=='*') {
            System.out.println(sayi1+"*"+sayi2+"="+(sayi1*sayi2));
        } else if (ch=='/') {
            System.out.println(sayi1+"/"+sayi2+"="+(sayi1/sayi2));
        }

    }
}
