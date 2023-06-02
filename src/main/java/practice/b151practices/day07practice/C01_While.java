package practice.b151practices.day07practice;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {
        /*
        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
       // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

       */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int sayi= input.nextInt();
        //1.yol
        int num=1;
        int faktoriyel=1;
        while(num<=sayi){
            faktoriyel=faktoriyel*num;
            num++;
        }
        System.out.println(sayi+"!="+faktoriyel);

        //2.yol
        int sonuc=1;
        while(sayi<10 && sayi>0){
            sonuc=sonuc*sayi;
            sayi--;
        }
        System.out.println(sonuc);














    }//main
}//class
