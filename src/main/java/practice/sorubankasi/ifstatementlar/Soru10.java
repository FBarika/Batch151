package practice.sorubankasi.ifstatementlar;

import java.util.Scanner;

public class Soru10 {
    /*
    10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
yazınız.
Geçersiz BMI değeri < 0
Zayıf = <18.5
Normal ağırlık = 18.5–24.9
Fazla kilolu = 25–29.9
Obezite = 30 veya daha büyük BMI
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen BMI degeri giriniz");
        double deger=input.nextDouble();
        if(deger<0){
            System.out.println("Geçersiz BMI değeri");
        } else if (deger<18.5 && deger>=0) {
            System.out.println("Zayıf");
        } else if (deger>=18.5 && deger<=24.9) {
            System.out.println("Normal ağırlık");
        } else if (deger>=25 && deger<=29.9) {
            System.out.println("Fazla kilolu");
        }else if(deger>=30){
            System.out.println("Obezite");
        }
    }
}
