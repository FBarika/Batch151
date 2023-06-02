package practice.b151practices.day06practice;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 1-4 arasinda bir numara giriniz\n" +
                "     işlem 1: Bakiye Sorgulama\n" +
                "     işlem 2: Para Cekme\n" +
                "     işlem 3: Para Yatırma\n" +
                "     işlem 4: İşlemi Sonlandırın");
        int numara =input.nextInt();

        int bakiye = 1000;
        switch(numara){
            case 1:
                System.out.println("Bakiyeniz: "+bakiye+ "TL");
            break;
            case 2:
                System.out.println("Cekmek istediginiz parayi giriniz");
                int cekilecekPara = input.nextInt();
                if(cekilecekPara<=bakiye){
                    bakiye=bakiye-cekilecekPara;
                    System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz: "+bakiye+ "TL");
                }else{
                    System.out.println("Bakiyeniz yetersiz");
                }
            break;

            case 3:
                System.out.println("Yatirmak istediginiz tutari giriniz");
                int yatirilacakTutar=input.nextInt();
                if(yatirilacakTutar<=2000) {
                    bakiye = bakiye + yatirilacakTutar;
                    System.out.println("Para yatirma isleminden sonraki mevcut " + bakiye + "TL dir.");
                }else{
                    System.out.println("Günlük para yatirma limiti 2000 TL dir");
                }
                break;
            case 4:
                System.out.println("Isleminiz sonlandiriliyor");
            default:
                System.out.println("Gecerli numara giriniz.");


        }


    }//main
}//class
