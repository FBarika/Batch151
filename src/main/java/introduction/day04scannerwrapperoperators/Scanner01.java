package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz..");

        int number = input.nextInt();

        //Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bölüp kalani aliriz
        //%==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bölümünden kalani verir.
        // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir.
        //Bir tam sayiyi bir tam sayiya bölerseniz java sonucu kesinlikle tam sayi yapar. ondalikli kismi iptal eder.
        //Java yuvarlama yapmaz.
        // Bir tamsayiyi 10 a bölersek birler basamagini silmis oluruz


       //   int number5 = (number%100)%10;
       //  int number4 = (number%100)/10;
       //  int number3 = (number%1000)/100;
       //   int number2 = (number/1000)%10;
       //  int number1 = (number/1000)/10;
       //  System.out.println("Toplam ="+(number1+number2+number3+number4+number5));
       // benim cözümüm :)

      //  System.out.println("Toplam ="+number1+"+"+number2+"+"+number3+"+"+number4+"+"+number5+"="+(number1+number2+number3+number4+number5));
      //   int num = 12345;
      //   int a = num%10;
      //   int b= (num/10)%10;
      //   int c= (num/100)%10;
      //   int d= (num/1000)%10;
      //   int e= (num/10000)%10;

      //   System.out.println(a+b+c+d+e);










        //son rakami al
        int lastDigit = number%10; // % bölünce kalani veriyor.
        // sayi kucult
        number = number/10; // sayi yi kucultmek icin 10 a bölduk java kalan olsa bile tam sayi olarak alir. mesela 3861/10 java 386 verir.
        // number 10 a bölünce ayni isimle isimlendirince number degeri degisiyor.

        // sondan ikinci rakami al
        int lastSecondDigit = number%10;
        // sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        // sayi kucult
        number =number/10;

        //sondan dördüncü rakami al
        int lastFourthDigit = number%10;
        // sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int lastFifithDigit = number%10;
        // sayi kucult
        number = number/10;

        System.out.println(lastDigit +lastSecondDigit+lastFourthDigit+lastFifithDigit);

        // ya da 1+2+4+5=12 demek icin;
        int toplam = lastDigit+lastSecondDigit+lastFourthDigit+lastFifithDigit;

        System.out.println("Toplam =" + lastDigit+"+"+lastSecondDigit+"+"+lastFourthDigit+"+"+lastFifithDigit+"="+(toplam));
        // ya da concat yapmamasi icin toplama yapilacak kismi parantez icine aldik.
        System.out.println("Toplam =" + lastDigit+"+"+lastSecondDigit+"+"+lastFourthDigit+"+"+lastFifithDigit+"="+(lastDigit+lastSecondDigit+lastFourthDigit+lastFifithDigit));




    }


}
