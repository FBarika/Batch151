package practice.sorubankasi.loopslar;

import java.util.Scanner;

public class Soru24 {
    public static void main(String[] args) {
        /*
        24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen kac tane fibonacci sayısı görmek istediginizi yaziniz");
        int adet =input.nextInt();
        int sum=0;
        int sayi1=0;
        int sayi2=1;

        sum=sayi1+sayi2;
        System.out.println(sum);
        System.out.println(sayi2);

        for (int i = 0; i <adet-2 ; i++) {
            sayi1=sayi2;
            sayi2=sum;
            sum=sayi1+sayi2;
            System.out.println(sum);
        }


    }
}
