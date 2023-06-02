package javaders.day16arraysforeachloopmehmethoca;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01tekrar {
    public static void main(String[] args) {
        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi istedigi zaman durdurabilmesi icin gereken kodu yaziniz.
         /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Coklu data'yi yerlestirmek icin bir array olusturmaliyim
            3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
            4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.
         */
        Scanner input= new Scanner(System.in);

        System.out.println("lütfen array e koyacaginiz eleman sayisini giriniz.");
        System.out.println("cikmak icin 'q' basiniz");

        int elemanSayisi =input.nextInt();
        String arr[]=new String[elemanSayisi];

        for (int i = 0; i <elemanSayisi ; i++) {
            System.out.println("Lütfen "+(i+1)+". elemani giriniz");
            String a =input.next();
            if(!a.equalsIgnoreCase("q")) {
                arr[i] = a;
            }else if(a.equalsIgnoreCase("q")){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));


    }//main
}//class
