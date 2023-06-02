package practice.b151practices.day06practice;

import java.util.Scanner;

public class C06_While {
    public static void main(String[] args) {
        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi =input.nextInt();
        for (int i = sayi; i <10-sayi%10+sayi ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
//2.yol
        System.out.println("Lütfen bir sayi giriniz");
        int sayi1=input.nextInt();
        while(sayi1%10!=0){
            System.out.print(sayi1+" ");
            sayi1++;
        }



    }//main
}//class
