package practice.smallstudygrup.forloop;

import java.util.Random;
import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        /*
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        */

        Random rnd = new Random();
        int sayi = rnd.nextInt(10);

        int tahminSayisi=0;
        int hak=5;
        do{
             Scanner input = new Scanner(System.in);
             System.out.println("Lütfen bir sayi giriniz");
             int tahminEdilenSayi=input.nextInt();
             if(tahminEdilenSayi>=10 || tahminEdilenSayi<0){
                 System.out.println("Lütfen gecerli bir sayi giriniz(0-100 arasinda)");
                 continue;
             }

            if(tahminEdilenSayi<sayi){
                System.out.println("Lütfen sayiyi büyütünüz.");
                hak--;
                System.out.println(hak+" tane hakkiniz kaldi");
            }else if(tahminEdilenSayi>sayi){
                System.out.println("Lütfen sayiyi kücültünüz");
                hak--;
                System.out.println(hak+" tane hakkiniz kaldi");
            }

            tahminSayisi++;
            if(tahminEdilenSayi==sayi){
                System.out.println("Tebrikler sayiyi "+tahminSayisi+". tahminde buldunuz");
                break;
            }
            if(hak==0){
                System.out.println("Üzgünüm oyun bitti");
                break;
            }
        }while(hak>0);































































    }//main
}//class
