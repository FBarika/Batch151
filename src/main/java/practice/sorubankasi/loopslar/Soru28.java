package practice.sorubankasi.loopslar;

import java.util.Scanner;

public class Soru28 {
    public static void main(String[] args) {
        /*
        28) Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= input.nextInt();
        int counter=2;
        for (int i = 2; i <sayi ; i++) {
            if(i==2){
                System.out.println(i);
            }else if(i%counter!=0){
                System.out.println(i);
            }
        }

    }
}
