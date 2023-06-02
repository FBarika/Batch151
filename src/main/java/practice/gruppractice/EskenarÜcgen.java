package practice.gruppractice;

import java.util.Scanner;

public class EskenarÜcgen {
    public static void main(String[] args) {
        /*
        Kullanicidan satir sayisi alinacak verilen satir sayisina göre "*" ifadesiyle eskenar ücgen cizilecek.
        */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz.");
        int satirSayisi= input.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=satirSayisi-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <2*i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        String str = "*";

        for (int i = 7; i > 0; i--) {

            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println(str);
            str = str + "**";

        }

        String str1="";
        for (int i   = 0; i < 7; i++) {

            str1= " ".repeat(6-i)+"*"+    "**".repeat(i);
            System.out.println(str1);
        }

         */
        /*

         */


    }
}
