package practice.b151practices.day02_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Ex: Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz.
        /*
           A
          A A
         A A A

        */
       //1.yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter veriniz.");
        char c = input.next().charAt(0);
        System.out.println(" "+" "+c+" "+" ");
        System.out.println(" "+c+" "+c+" ");
        System.out.println(c+" "+c+" "+c);


        //Ex:Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin
        //sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz.

        System.out.println("Lütfen 2 sayi giriniz.");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son iki rakamalari toplamini bulan kodu yaziniz.
        System.out.println("Lütfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();

        /** First Way **/
        int lastDigit = num % 10;
        num = num /10;
        int lastSecondDigit = num % 10;
        num = num /10;
        int lastThirdDigit = num % 10;
        num = num / 10 ;
        int lastFourthDigit = num % 10;
        num = num / 10;
        int lastFifthDigit = num % 10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);

        //Second Way
        System.out.println("Lütfen bir 5 basamakli sayi giriniz");
        int sayi=input.nextInt();
        int birinci = sayi%10;
        int ikinci =(sayi/10)%10;
        int ücüncü=(sayi/100)%10;
        int dördüncü=(sayi/1000)%10;
        int besinci=(sayi/10000)%10;
        System.out.println(birinci+ikinci+dördüncü+besinci);















    }//main
}//class
