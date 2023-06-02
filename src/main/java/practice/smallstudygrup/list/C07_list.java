package practice.smallstudygrup.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_list {
    public static void main(String[] args) {
          /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */
        Random randomSayilar=new Random();
        int sayi=0;
        List<Integer>sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200){
            sayi=randomSayilar.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }

        }


        Scanner scan=new Scanner(System.in);
        int kalanTahmin=5;
        int tahminSayisi=0;

        do {
            System.out.println("lutfen tahminde bulunmak icin sayi giriniz");
            sayi= scan.nextInt();
            tahminSayisi++;
            if (sayiListesi.contains(sayi)) {
                System.out.println("tebrikler " + tahminSayisi + ". tahminde dogru sonuca ulastiniz");
                break;
            }
            kalanTahmin--;
            System.out.println("kalan tahmin sayiniz : "+kalanTahmin);
        }while (kalanTahmin>0);
        if (kalanTahmin==0){
            System.out.println("malesef bulamadiniz");
        }
    }
}