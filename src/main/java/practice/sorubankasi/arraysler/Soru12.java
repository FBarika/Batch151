package practice.sorubankasi.arraysler;

import java.util.Arrays;
import java.util.Scanner;

public class Soru12 {
    /*
    12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
büyük öğeler arasındaki farkı konsolda yazdırınız.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen array uzunlugunu giriniz");
        int lenght = input.nextInt();
        int sayilar [] = new int[lenght];
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.println("Lütfen bir tamsayi giriniz");
            int sayi= input.nextInt();
            sayilar[i]=sayi;

        }
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[2, 3, 6, 8, 9]

        int diff=sayilar[1]-sayilar[0];
        for (int i = 0; i < sayilar.length-1 ; i++) {
            Math.min(diff,sayilar[i+1]-sayilar[i]);

        }
        System.out.println(diff);

        for (int i = 0; i <sayilar.length-1 ; i++) {
            if(sayilar[i+1]-sayilar[i]==diff){
                System.out.println(sayilar[i+1]);
                System.out.println(sayilar[i]);
            }
        }









    }
}
