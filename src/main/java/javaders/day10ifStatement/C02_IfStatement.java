package javaders.day10ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        // Kullanici gun ismini girsin kod gunu yazsin
        // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
        // 5== Persembe  6 == Cuma  7 == Cumartesi

     Scanner input = new Scanner(System.in);
        System.out.println("Lütfen asagidaki talimatlara uygun gün sayisi giriniz\n" +
                "1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba\n" +
                " 5== Persembe  6 == Cuma  7 == Cumartesi");

        int day = input.nextInt();
        if(day==1){
            System.out.println("Pazar");
        }else if(day==2){
            System.out.println("Pazartesi");
        }else if(day==3){
            System.out.println("Sali");
        }else if(day==4){
            System.out.println("Carsamba");
        }else if(day==5){
            System.out.println("Persembe");
        }else if(day==6){
            System.out.println("Cuma");
        }else if(day==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Lütfen gecerli bir numara giriniz\n" +
                    "1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba\n" +
                    " 5== Persembe  6 == Cuma  7 == Cumartesi");
        }// benim cözümüm

        /*

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarasini giriniz\n" +
                "1 == Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba\n" +
                "5== Persembe  6 == Cuma  7 == Cumartesi");

        byte gun = input.nextByte();
        if(gun==1){
            System.out.println("Pazar");
        } else if (gun==2) {
            System.out.println("Pazartesi");
        } else if (gun==3) {
            System.out.println("Sali");
        }else if(gun==4) {
            System.out.println("Carsamba");
        } else if (gun==5) {
            System.out.println("Persembe");
        } else if (gun==6) {
            System.out.println("Cuma");
        }else if(gun==7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Lutfen gecerli bir rakam giriniz.\n" +
                    "1 == Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba\n" +
                    "5== Persembe  6 == Cuma  7 == Cumartesi");
        }

*/



    }//main
}//class
