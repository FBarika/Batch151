package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01Tekrar {
    public static void main(String[] args) {
        /*
    Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
    Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdirin.
     */

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen cisiyetinizi kadinsa k erkekse e seklinde giriniz");
        char cinsiyet = input.next().toLowerCase().charAt(0);
        System.out.println("Lütfen yasinizi  0<yas<120 olacak sekilde giriniz");
        int yas =input.nextInt();
        if(yas<0 || yas>120){
            System.out.println("Lütfen gecerli bir yas giriniz.");
        }else if(cinsiyet=='k'){
            if(yas>60){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("calismaya devam etmeli");
            }
        }else if (cinsiyet=='e'){
            if(yas>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("calismaya devam etmeli");
            }
        }else{
            System.out.println("gecersiz cinsiyet");
        }
    }//main
}//class
