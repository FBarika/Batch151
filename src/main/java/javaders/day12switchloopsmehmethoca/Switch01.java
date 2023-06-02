package javaders.day12switchloopsmehmethoca;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Example 1 : Ay numarasini söyleyince numarasi verilen aydan baslayip 12. aya kadar
        // tüm aylarin isimlerini yazdiran kodu yaziniz.
        // 8==> August September October November December
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangic ayinin kacinci ay oldugunu giriniz...");
        int numOfMonth =input.nextInt();
        switch (numOfMonth){
            case 1 :
                System.out.println("January");
            case 2 :
                System.out.println("February");
            case 3 :
                System.out.println("March");
            case 5 :
                System.out.println("May");
            case 6 :
                System.out.println("June");
            case 7 :
                System.out.println("July");
            case 8 :
                System.out.println("August");
            case 9 :
                System.out.println("September");
            case 10 :
                System.out.println("October");
            case 11 :
                System.out.println("November");
            case 12 :
                System.out.println("December");
            break;
            default :
                System.out.println("Invalid Month");
        }
       // aylari tek tek görmek istersek her case den sonra break kullanicaz.
       //Note:"switch" condition paraantezi icerisinde 1)String 2)int 3) byte 4)short 5) char kullanilabilir.
       //Note:"switch" condition paraantezi icerisinde 1)boolean 2)float 3) double 4)long KULLANILAMAZ.
    }//main
}//class
