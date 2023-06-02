package practice.replit.sysolar;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir Float değer girmesini isteyin,
        bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen float bir deger giriniz");
        float sayi1=input.nextFloat();

        short sayi2= (short) sayi1;
        System.out.println(sayi2);
    }
}
