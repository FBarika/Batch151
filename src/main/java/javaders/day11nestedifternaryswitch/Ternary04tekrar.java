package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04tekrar {
    public static void main(String[] args) {
    /*
    Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz tek ise "bu sayi ikiye bolünmez"
    ekrana yazdiriniz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi =input.nextInt();
        Object result = sayi%2==0 ? sayi/2 : "bu sayi ikiye bolünmez";
        System.out.println(result);


    }//main
}//class
