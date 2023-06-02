package javaders.day10ifStatement;

import java.util.Scanner;

public class C02_IfStatementtekrar {
    public static void main(String[] args) {

        // Kullanici gun ismini girsin kod gunu yazsin
        // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
        // 5== Persembe  6 == Cuma  7 == Cumartesi

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz.");
        String day =input.next();
         if(day.equalsIgnoreCase("pazar")){
             System.out.println("Pazar haftanin 1.günü");
         } else if (day.equalsIgnoreCase("pazartesi")) {
             System.out.println("Pazartesi haftanin 2.günü");

         }else if (day.equalsIgnoreCase("sali")) {
             System.out.println("Sali haftanin 3.günü");

         }else if (day.equalsIgnoreCase("carsamba")) {
             System.out.println("Pazartesi haftanin 4.günü");

         }else if (day.equalsIgnoreCase("persembe")) {
             System.out.println("Pazartesi haftanin 5.günü");

         }else if (day.equalsIgnoreCase("cuma")) {
             System.out.println("Pazartesi haftanin 6.günü");

         }else if (day.equalsIgnoreCase("cumartesi")) {
             System.out.println("Pazartesi haftanin 7.günü");

         }else{
             System.out.println("Gecersiz gün ismi");

         }


    }//main
}//class
