package javaders.lambda_recap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        //Lamba Map haric tum Collection uyelerinde kullanabiliriz.Map'lerde key value iliskisi oldugu icin kullanamayiz.

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitifLamExYazdir(sayi);
        System.out.println();
        ciftvePozitifMetRef(sayi);
        System.out.println();
        kareYazdir(sayi);
        System.out.println();
        kareTekrarsiz(sayi);
        System.out.println();
        buyKucSirala(sayi);
        System.out.println();
        pozitifKüpBirlerBas5(sayi);
        System.out.println();
        toplamMetRef(sayi);
        System.out.println();
        toplamLamdaEx(sayi);
        System.out.println();
        System.out.println(ciftKareKuBüList(sayi));


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın.
    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){

        sayi.stream().filter(t-> t%2==0 && t>0).forEach(t-> System.out.print(t+" "));

    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın.
    public static void ciftvePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t-> t%2==0 && t>0).forEach(Utils :: yazdir);

    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi){
       // sayi.stream().map(t-> t*t).forEach(Utils ::yazdir);
        sayi.stream().map(Utils ::kareBul).forEach(Utils ::yazdir);

    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz(List<Integer> sayi){

        sayi.stream().map(Utils ::kareBul).distinct().forEach(Utils :: yazdir);

    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın.
    public static void buyKucSirala(List<Integer> sayi){

       sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils ::yazdir);
        //sorted tek basina kucukten buyuge siralar, sorted(Comparator.reverseOrder())  seklinde buyukten kucuge siralar(tersten yani)
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız.

    public static void pozitifKüpBirlerBas5(List<Integer> sayi){
        sayi.stream().filter(t-> t>0).map(Utils ::küpAl).filter(t-> t%10==5).forEach(Utils ::yazdir);
    }

    //"->"  bu isareti adi arrow function

    // SORU7: List elemanlarının Method Reference ile toplamını bulun ve yazdırın.

    public static void toplamMetRef(List<Integer> sayi){
       Optional<Integer> sum=  sayi.stream().reduce(Integer :: sum);
        //Optional yapma sebebi :listin icerisinde hicbir eleman yoksa null olacagi icin ve
        // bunu bir int'e assign edersek NullPointerException verecegi icin Optional yaptik
        System.out.println(sum);
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın.
    public static void toplamLamdaEx(List<Integer> sayi){
       int sonuc = sayi.stream().reduce(0,(t,u)-> t+u);
        //Bir onceki soruda Method Reference kullandigimiz icin list elemanlarinin toplamini
        // bir int'e assign ettigimizde kizarmis ve Optional'a cevirmisti ama burda hata vermedi
        // cunku hicbir deger olmasa bile elimizde baslangic olarak 0 mevcut.
        System.out.println(sonuc);
    }
    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer>  ciftKareKuBüList(List<Integer> sayi){
       return sayi.stream().filter(t-> t%2==0).map(Utils ::kareBul).sorted().collect(Collectors.toList());
    }









}
