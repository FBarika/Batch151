package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    /*
    Kullanicidan alinan iki sayidan kucuk olani ekrana yazdiriniz.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter two integers...");
        int first = input.nextInt();
        int second= input.nextInt();
        System.out.println(Math.min(first,second));//3.yol
        //1.yol
        if(first<second){
            System.out.println(first);
        } else {
            System.out.println(second);}
        //2.yol : Use Ternary

       int result = first<second ? first : second;//esitlik durumunda first<second false olacagi icin
        // iki noktadan sonrasi second yazdiracagi icin second da ayni sayi olacagi  icin console a ikinci sayi yazdirilir.
        System.out.println(result);


    }//main
}//class
