package practice.b151practices.day03practice;

import java.util.Scanner;
public class C05_Ternary {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Tam Sayi Giriniz");
        double sayi = scan.nextDouble();
        Object obj = sayi%2==0 ? ("Çift Sayi"):(sayi + 3);
        System.out.println(obj);

    }
}
