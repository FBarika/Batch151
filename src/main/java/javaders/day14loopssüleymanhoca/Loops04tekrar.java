package javaders.day14loopssüleymanhoca;

import java.util.Scanner;

public class Loops04tekrar {
    public static void main(String[] args) {
        //Kullanici username ve password'u girsin.
        // 3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
        //3 kereye kadar yanlis girerse "Invalid username or password," mesaji alsin
        //Dogru girerse "Welcome to your account" mesaji alsin
        Scanner input =new Scanner(System.in);
        int counter =1;
        String sifre1="123456";
        String ad1="fatma";
        System.out.println("Cikmak icin 'q' ya basiniz.");
        do{

            System.out.println("Lütfen sifrenizi giriniz");
            String sifre = input.next();
            if(sifre.equalsIgnoreCase("q")){
                System.out.println("see you soon");
                break;
            }
            System.out.println("Lütfen kullanici adinizi giriniz.");
            String ad = input.next();

            if(sifre.equalsIgnoreCase(sifre1) && ad.equalsIgnoreCase(ad1)){
                System.out.println("Welcome to your account");
                break;
            } else if (counter==3) {
                System.out.println("Your account was blocked");
                break;
            }else if(counter<3){
                System.out.println("Invalid username or password " + (3-counter) + " hakkiniz kaldi");
                counter++;
            }


        }while(true);
    }//main
}//class
