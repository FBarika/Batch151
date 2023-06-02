package practice.b151practices.day01_practice;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {
        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen hizmet yilinizi giriniz");
        int yil = input.nextInt();
        System.out.println("Lütfen maasinizi giriniz");
        int maas = input.nextInt();
        if(yil>=5){
            System.out.println("Zamli Maas:"+((maas*110)/100));
        }else {
            System.out.println("Daha Calisilmasi Gereken Yil:" +(5-yil));

        }

    }//main
}//class
