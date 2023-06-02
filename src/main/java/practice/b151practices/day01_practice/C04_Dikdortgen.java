package practice.b151practices.day01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kisa kenarini giriniz");
        int kisaKenar = input.nextInt();

        System.out.println("Lütfen dikdörtgenin uzun kenarini giriniz.");
        int uzunKenar = input.nextInt();

        System.out.println("Cevre="+(kisaKenar+uzunKenar)*2);



    }//main
}//class
