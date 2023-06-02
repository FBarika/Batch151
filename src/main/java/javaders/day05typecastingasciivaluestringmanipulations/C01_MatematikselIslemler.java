package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    /*
        -Javada farkli data type lari arasinda islem yapiliyorsa
        sonuc buyuk olan data type inin turunde olur.
        -Karsilastirma operatorlerinde sonuc hep boolean döner.
        < Kücüktür
        > Büyüktür
        == Esittir
        != esit degildir
        <= kucuk esittir
        >= buyuk esittir
        && and (ve ) operatoru
        || or (veya) operatoru
         */
    public static void main(String[] args) {
        System.out.println(4*(5+2)/3); //9
        // int/int==> int olacagi icin 9.33333334 yerine virgulden sonrasini siler ve tam sayi kismini göruruz.

        System.out.println(6*16/8);// 12
        System.out.println(4*(2+5)/3);//9

        double sonuc = 4*(2+5)/3;
        System.out.println("sonuc = " + sonuc);// 9.0 olur int int ile islem yaptigimiz icin sonuc 9.3 degil 9.0 olur yine int olur sepet double olsa bile

        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2);//sonuc2 = 9.333333333333334 buradaki data lardan biri double olursa sonuc double olur.9.3 verir

        System.out.println(4*(1+5)/3);// 8

        int sayi1 = 5;
        int sayi2 =2;
        double sayi3 =2;
        System.out.println(sayi1/sayi2);// 2 normalde 2.5 ancak int/int = int olacagi icin tam sayi kismi alinir virgulden sonrasi atilir

        System.out.println(sayi1/sayi3);//2.5  islem sonucu büyük olan data type inde calisir yani double !!!!!
        System.out.println(sayi1+sayi3/sayi2);//6.0 burda da double data type oldugu icin islemler arasinda sonuc yine double olacak.

        boolean first = 2<4;
        boolean second = 2+6 !=8;
        boolean third = 2+3*5<20;

        System.out.println("first = " + first);//t
        System.out.println("second = " + second);//F
        System.out.println("third = " + third);//t

        System.out.println(first&&second);//f
        System.out.println(first||second||third);//t





    }//main

}//class
