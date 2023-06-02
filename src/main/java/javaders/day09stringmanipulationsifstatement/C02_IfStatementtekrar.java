package javaders.day09stringmanipulationsifstatement;

import java.util.Scanner;

public class C02_IfStatementtekrar {
    public static void main(String[] args) {
        // String str ="aac" tekrarsiz karakterleri ekrana yazdiriniz. soru uzamasin diye aac yaptik
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        String k =input.next();


        for(int i=0;i<k.length();i++){
            char ch =k.charAt(i);
            if(k.indexOf(ch)==k.lastIndexOf(ch)){
                System.out.println(ch);
            }

        }














    }//main
}//class
