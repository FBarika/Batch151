package practice.sorubankasi.switchonstatementlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        /*
        3) Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.

         */

        List<String> aylar =new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay numarasi giriniz");
        int ayNo=input.nextInt();
        switch(ayNo){
            case 1:aylar.add("Ocak");

            case 2:aylar.add("subat");

            case 3:aylar.add("Mart");

            case 4:aylar.add("Nisan");

            case 5:aylar.add("Mayis");
            break;
            default:
                System.out.println("Lütfen gecerli bir numara giriniz");
        }
        System.out.println(aylar);






















    }
}
