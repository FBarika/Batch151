package javaders.day12switchincrementdecrementloopssüleymanhoca;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldiginiz karakterin sesli harf olup olmadigini kontrol eden kodu yaziniz.
        sesli harf a-e-i-o-u
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char letter = input.next().charAt(0);// to lowercase string lerde calisir char da calismaz.
        //1. yol
         switch(letter){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
             case 'A':
             case 'E':
             case 'I':
             case 'O':
             case 'U':
                 System.out.println(letter+" is a vowel"); // char string le yan yana yazilinca stringlesir.
                 break;
             default:
                 System.out.println(letter+" is not a vowel");

         }
        //2.yol
        System.out.println("Lütfen bir harf giriniz.");
         String letter2 =input.next().substring(0,1).toLowerCase();
        switch(letter2){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");

        }
        //3.yol
        System.out.println("Lütfen bir harf giriniz.");
        String letter3 =input.next().substring(0,1);// estetik olarak güzel görünmesi icin baska bir yol lowercase kaldirdik console da dinamik görünmesi icin
        switch(letter3){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":

                System.out.println(letter3 + " is a vowel");
                break;
            default:
                System.out.println(letter3 + " is not a vowel");

        }// kisa kod makbuldur ama dinamik mesaj vermek icin kod uzayabilir.

    }//main
}//class
