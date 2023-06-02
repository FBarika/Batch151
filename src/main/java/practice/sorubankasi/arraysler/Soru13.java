package practice.sorubankasi.arraysler;

import java.util.Arrays;
import java.util.Scanner;

public class Soru13 {
    /*
    13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String isimler []=new String [2];
        for (int i = 0; i <2 ; i++) {
            System.out.println("Lütfen String degerler giriniz");
            String isim = input.next().toLowerCase();
            isimler[i]=isim;
        }
        System.out.println(Arrays.toString(isimler));
        for (int i = 0; i < isimler.length-1 ; i++) {
            if((isimler[i].length()==isimler[i+1].length()) && (isimler[i].contains(isimler[i+1].substring(i,i+1)))){
                System.out.println("anagram");
            }else{
                System.out.println("anagram degil");
            }
       }


    }
}
