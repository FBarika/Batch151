package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*
        Kullanıcıdan data almak ıcın Scanner Classı kullanılır Ve Bır ınput/scan/scanner objesı olusturulur
        bu objeyı new objeyı new key worduyle olustururuz

         */

        // 1) Adim Object olusturma
        Scanner input = new Scanner(System.in);// kisi barika
        //2) Kullaniciya ne yapacagini söylüyoruz.
        System.out.println("Lütfen maasinizi giriniz.");// kisiye komut veriyor

        //3)Adim kullanicidan alinan datalar yapisina ve buyuklugune gore bir Variable a yerlestirilir.
        long maas = input.nextLong();
        
        //4) Kullanicinin verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz.
        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("Lütfen cinsiyetinizi Kadin ise K Erkek ise E olaral giriniz.");
        char cinsiyet = input.next().charAt(0);
        // nextchar() diye method olmadigi icin tek karakter almak icin once string methodu next i secip
        // charAt() methodu ile ilk karakteri aliyoriz.



        System.out.println("Lütfen isminizi giriniz.");
        input.nextLine();// dummy atildi satir atlamasi yapmamasi icin.
        String isim = input.nextLine();


        System.out.println("Lütfen memleketinizi giriniz");
        String memleket = input.next();
        
        System.out.println("Lütfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lütfen boyunzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lütfen ülkenizi seviyorsaniz T Sevmiyorsaniz F giriniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("*************** Barika *****************");
        System.out.println("cinsiyet : "+cinsiyet+"\n"+"isim : "+isim+"\n"+"memleket : "
                +memleket+"\n"+"yas : "+yas+"\n"+"boy : "+boy+"\n"+"seviyorMu : "+seviyorMu);

        //ya da
        // System.out.println("cinsiyet : "+cinsiyet+"\nisim : "+isim+"\nmemleket :" + memleket+"\nyas : "+yas+"\nboy :" +boy+"\nseviyorMu :" +seviyorMu);


        




        
        


    }//


}
