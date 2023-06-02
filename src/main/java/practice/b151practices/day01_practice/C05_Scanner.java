package practice.b151practices.day01_practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz..");
        String ad= input.nextLine();
        System.out.println("Lütfen soyadinizi giriniz..");
        String soyAd= input.nextLine();
        System.out.println("Lütfen yasinizi giriniz..");
        int yas = input.nextInt();
        System.out.println("Lütfen boyunuzu giriniz..");
        double boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz..");
        int kilo =input.nextInt();
        System.out.println("Adi:" + ad+ "\n"+ "Soyadi:" +soyAd+ "\n" + "Yas:"+yas+ "\n" +"Boy:" + boy+ "\n" + "Kilo:"+kilo);

        // nextline kullanirken satir atlamamasi icin kullanilacak kodu ögren!!!!!!!!!!!!!!!!!
        // dummy input.nextLine(); input un bir üstüne input.nextLine(); bunu atiyoruz.Satir atlamamasi icin.







    }//main
}//class
