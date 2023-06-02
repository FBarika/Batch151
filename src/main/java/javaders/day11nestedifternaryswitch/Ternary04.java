package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    /*
    Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz tek ise "bu sayi ikiye bolünmez"
    ekrana yazdiriniz
    */

    /*
    Ternary de true ve false durumlari icin size verilen data type lari farkli ise olusturdugunuz
    container in data type ni Object yapiniz. Object Java da bir class tir.
    Object java daki bütün class larin "Parent" dir.Yani babasidir.
    "Object" class in parent i yoktur.
    Java da parent i olmayan tek class object class tir.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

       Object result = num%2==0 ? num/2: "Bu sayi ikiye bolunmez";
        System.out.println(result);



    }//main
}//class
