package practice.sorubankasi.switchonstatementlar;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*
        5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
Örnek: 2000 yılının Şubat ayında gün sayısı 29.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay numarasi giriniz");
        int ayNumarasi=input.nextInt();
        System.out.println("Lütfen yili giriniz");
        int yil=input.nextInt();
        switch (ayNumarasi){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(yil+" yilinin "+ayNumarasi+".ayinda gün sayisi 31");
            break;
            case 2:
                if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)){
                    System.out.println(yil+" yilinin "+ayNumarasi+".ayinda gün sayisi 29");
                }else{
                    System.out.println(yil+" yilinin "+ayNumarasi+".ayinda gün sayisi 28");
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(yil+" yilinin "+ayNumarasi+".ayinda gün sayisi 30");
            break;
            default:
                System.out.println("Lütfen gecerli bir yil ve ay numarasi giriniz");
        }

    }
}
