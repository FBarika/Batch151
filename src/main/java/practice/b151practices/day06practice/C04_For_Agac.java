package practice.b151practices.day06practice;

import java.util.Scanner;

public class C04_For_Agac {
    public static void main(String[] args) {
        /*

     Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
     sisteme girmesini isteyiniz.

     Asagıdaki agac seklini konsala yazdırınız

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    |||
    |||
    |||
    |||
    |||

     */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir=input.nextInt();
        System.out.println("Lütfen satir sayisini giriniz");
        int satir1=input.nextInt();
        System.out.println("lütfen sütun sayisini giriniz");
        int sütun=input.nextInt();

        System.out.println();
        for (int i = 1; i <=satir ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print("^"+" ");
            }
            System.out.println();
        }
        for (int i =1; i <=5 ; i++) {
            for (int j =1; j <=3 ; j++) {
                System.out.print("|");
            }
            System.out.println();
        }

        /*
        "2.YOL
        System.out.println("Yaprak Satir Sayisini Giriniz");
        int yaprakSatirSayisi = scan.nextInt();
        System.out.println("Govde Satir Sayisini Giriniz");
        int govdeSatirSayisi = scan.nextInt();
        String yaprak = "";
        for (int i = 0; i <yaprakSatirSayisi ; i++) {  // 0'dan yaprak satır sayısına kadar donguye aldık
            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <govdeSatirSayisi ; i++) { // 0'dan govde satır sayısına kadar donguye aldık
            System.out.println("|||");
        }

         */
















    }//main
}//class
