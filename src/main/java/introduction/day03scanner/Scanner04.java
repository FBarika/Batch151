package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

     //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        double firstNummer = input.nextDouble();
        double secondNummer = input.nextDouble();
        System.out.println(firstNummer + secondNummer);
        System.out.println(firstNummer - secondNummer);
        System.out.println(firstNummer * secondNummer);
        System.out.println(firstNummer / secondNummer);


    }
}
