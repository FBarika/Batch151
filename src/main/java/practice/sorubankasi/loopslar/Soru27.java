package practice.sorubankasi.loopslar;

import java.util.Arrays;
import java.util.Scanner;

public class Soru27 {
    public static void main(String[] args) {
        /*
        27) Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.

       */
        Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir toplam sayi giriniz");
        int toplam = input.nextInt();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(j<i || j>i){
                   if(toplam-arr[i]==arr[j] ){
                       System.out.println(arr[i]+"+"+arr[j]+"="+(10));
                   }
                }
            }
        }

        int num = 10;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==num) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }

    }
}
