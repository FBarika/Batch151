package javaders.day10ifStatement;

import java.util.Scanner;

public class C01_IfStatementtekrar {
    public static void main(String[] args) {

        // Ex: Verilen bir karakterin buyuk harf ise ekrana
        // "Buyuk Harf " yazdiran kodu yaziniz"

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char ch =input.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("Büyük harf");
        }else if(!(ch>='A'&& ch<='Z')){
            System.out.println("Büyük harf degil");
        }
        //Ex: Verilen bir sayi 300 den kucuk veya 1200 den büyük ise "Harika Sayi" yazdiran kodu yaziniz.

        int sayi=365;
        if(sayi<300 || sayi>1200){
            System.out.println("Harika Sayi");
        }else{
            System.out.println("Harika sayi degil");
        }
    }//main
}//class
