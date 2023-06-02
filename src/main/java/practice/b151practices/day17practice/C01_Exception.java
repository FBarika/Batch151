package practice.b151practices.day17practice;

import java.util.Scanner;

public class C01_Exception {
    // Kullanıcıdan istedigi kadar sayiyi alıp toplayan bir program yazınız
    // toplam 500'u gecerse programı bitirsin veya
    // kullanıcı bitirmek istediginde Q'ya basmalıdır
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int toplam=0;
        do{
            System.out.println("Toplamak istediginiz sayiyi giriniz \nBitirmek icin Q'ya basiniz.");
            int sayi=0;
            try {
                sayi=input.nextInt();
            } catch (Exception e) {
              String hataliGiris= input.next();
              if(hataliGiris.equalsIgnoreCase("q")){
                  break;
              }else{
                  System.out.println("Hatali Giris");
              }
            }
            //Biz q ya basinca int a esayn edemeyecegimiz icin InputMismatchException verdi bu bir RunTimeException dir.
            toplam+=sayi;

        }while(toplam<500);

        System.out.println("Girdiginiz Sayinin toplami: "+toplam);
    }
}
