package practice.b151practices.day02_practice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        /*
Kullanicidan bir gun alin
Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
 yazdiran kodu olusturunuz
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz.");
        String gun = input.next().toUpperCase();
        if(gun.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar Icin Kutsal Gun");
        }else if(gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin Kutsal Gun");
        }else if(gun.equalsIgnoreCase("pazar")){
            System.out.println("Hristyanlar icin Kutsal Gun");
        }else{
            System.out.println("Lütfen gecerli bir gün giriniz.");
        }

        /*
         Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
         Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
         3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
         Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
        */


        System.out.println("Lütfen 3 karakterden daha uzun bir kelime giriniz");
        String s =input.next();
        if(s.length()<=3){
            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz ");
        }else {
            String sonUcHarf =s.substring(s.length()-3);
            System.out.println(sonUcHarf +s+ sonUcHarf);//umacumauma
        }



















    }//main
}//class
