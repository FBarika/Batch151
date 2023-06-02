package practice.replit.forwhileler;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
/*
Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=6*5*4*3*2*1=720
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=input.nextInt();
        int carpim=1;
        for (int i = sayi; i>0 ; i--) {
            carpim=carpim*i;
        }
        System.out.println(carpim);











    }
}
