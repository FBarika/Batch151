package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01tekrar {
    public static void main(String[] args) {
        /*
    Kullanicidan alinan iki sayidan kucuk olani ekrana yazdiriniz.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz.");
        int sayi1= input.nextInt();
        int sayi2= input.nextInt();
        //1.yol
        if(sayi1<sayi2){
            System.out.println(sayi1);
        }else{
            System.out.println(sayi2);
        }
     //2.yol
        System.out.println(Math.min(sayi1,sayi2));

     //3.yol
       int sonuc = sayi1<sayi2 ? sayi1 : sayi2;
        System.out.println(sonuc);
    }//main
}//class
