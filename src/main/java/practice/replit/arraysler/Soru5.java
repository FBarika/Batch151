package practice.replit.arraysler;

import java.util.Scanner;

public class Soru5 {
    /*
    yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020

Beklenen Çıktı:**True**

Aranan Değer:2010

Beklenen Çıktı :**False**
     */
    public static void main(String[] args) {


        int sayi = 2020;
        int[] sayilar = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int counter=0;
        for (int w:sayilar) {
            if(sayi==w){
                counter++;
            }
        }

        if(counter>0){
            System.out.println("**True**");
        }else{
            System.out.println("**False**");
        }



















    }
}
