package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        //1)Alanini hesaplayiniz.
        //2)cevresii hesaplayiniz
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kisa kenari uzunlugunu giriniz");
        double kisaKenar = input.nextDouble();
        System.out.println("Lütfen dikdörtgenin uzun kenari uzunlugunu giriniz");
        double uzunKenar = input.nextDouble();

        double alan = kisaKenar*uzunKenar;
        System.out.println("Alan = " + alan); // Tavsiye edilen

        System.out.println("Cevre = " +((kisaKenar+uzunKenar)*2));


    }
}
