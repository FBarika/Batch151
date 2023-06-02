package javaders.day18constructorsstatickeywordsüleymanhoca;

import java.time.LocalDate;

     /*
        1)"static block" lar "static variable" lara "ilk degerlerini atamak"(initialize==baslatmak demek) icin kullanilir.
        2)"static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
        3)"static" bir variable'a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama
          "static block" icine yazilan kod "main method" icine yazilan kod'dan once calistirilir.
        4)Bir class'da bir'den fazla static block varsa ustteki once calistirilir.
     */


public class StaticNonStaticBlocks01 {

    //static variable'lar "static block" kullanilmadan da "initialize" edilebilirler.mesela ilk degerini atayarak.
    public static double pi = 3.14;

    //static variable'lar "static block" kullanilarak da "initialize" edilebilirler.

    public static double e; //static block kullanilmadan initialize.

    static{
        e=2.71;//static block kullanilarak initialize.
    }


    //Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
    public static double price; // biz price class olusturuldugunda hemen baslatilmasini istiyorsak main den önce static block un icine yaziyoruz.

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }

    static{
        System.out.println("Hey I am a static block 2");
    }

    static{ // price a deger vermek icin kod yazmak gerekirse static block kullaniriz. Bunun gibi.
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }
    }

// Java class i olusturdugu anda static variable lari olusturur.Bir bütün halinde olusur bunlar. Biz class a sahip oldugumuz anda static variable da sahip olmusuz demektir.
//Static blocklar static oldugu icin class olusturulurken class a monte edilir.Static blocklar main methodtan önce calistirilir.
// O yüzden kodlari burda main method icine degil de static block icine yazdik.

}