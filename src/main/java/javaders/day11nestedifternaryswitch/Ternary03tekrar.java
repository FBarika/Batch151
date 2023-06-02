package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03tekrar {
    public static void main(String[] args) {
        /*
    Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
   1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
   2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
     */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz");
        int yil = input.nextInt();
        String result =yil%100==0 ? (yil%400==0 ? "Leap" : "Not Leap"): (yil%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);
        //2.yol
        if(yil%100==0){
            if(yil%400==0){
                System.out.println("Leap");
            }else{
                System.out.println("Not Leap");
            }

        } else if (yil%4==0) {
            System.out.println("Leap");

        }else{
            System.out.println("Not Leap");
        }

    }//main
}//class
