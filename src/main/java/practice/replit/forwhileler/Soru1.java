package practice.replit.forwhileler;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
e.g:
char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        String isim =input.nextLine().toLowerCase();
        input.nextLine();
        System.out.println("Lütfen bir karakter giriniz");
        char ch =input.next().toLowerCase().charAt(0);
        int counter=0;
        for (int i =0; i <isim.length() ; i++) {
            if(isim.charAt(i)==ch){
                counter++;
            }
        }
        System.out.println("Number of a ="+counter);










    }
}
