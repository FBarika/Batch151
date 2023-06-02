package practice.b151practices.day01_practice;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int number1 =input.nextInt();
        System.out.println("Lütfen bir sayi daha giriniz");
        int number2 = input.nextInt();
        if(number1>number2){
            System.out.println("büyük");
        }else{
            System.out.println("kücük");
        }



    }//main
}//class
