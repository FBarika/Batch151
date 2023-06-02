package practice.b151practices.day06practice;

import java.util.Arrays;
import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {
        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz
      */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayi giriniz");

        int newArr []=new int [5];

        for (int i = 0; i <5 ; i++) {
            int sayi=input.nextInt();
                newArr[i]=sayi;

        }
        System.out.println(Arrays.toString(newArr));
        int sum=0;
        for (int w:newArr) {
            if(w>5 && w<10){
                continue;
            }
            sum=sum+w;
        }
        System.out.println(sum);//27




    }
}
