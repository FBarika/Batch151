package javaders.day12switchincrementdecrementloopssüleymanhoca;

import java.util.Scanner;

public class Switch02tekrar {
    public static void main(String[] args) {

        /*
        Kullanicidan aldiginiz karakterin sesli harf olup olmadigini kontrol eden kodu yaziniz.
        sesli harf a-e-i-o-u
        */
        // 1.yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch = input.next().toLowerCase().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
            System.out.println(ch + " bir sesli harftir.");
        }else if(!(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')){
            System.out.println(ch+" bir sesli harf degildir");
        }
        //2.yol
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " sesli bir harftir.");
            break;
            default:
                System.out.println(ch + " sesli bir harf degildir.");
        }


    }//main
}//class
