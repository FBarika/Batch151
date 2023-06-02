package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorlari {

    public static void main(String[] args) {

        /*
        Javada islem yaptiran
        == Esittir
        != Esit degildir
        < Kucuktur
        <= kucuk esittir.
        >=büyük esittir.
        > Buyuktur
        = atama operatöru
        && ==> and(ve) operatoru mükemmelliyetci


        1<4<5 ==> matematik uclu karsilastirma yapar ancak java uclu kiyas yapamaz.
        1<4 && 4<5; java bu sekilde ikili kiyas yapip mantik operatorlaeriyle birlestirme yapar

        && ==> ve(and) operatoru mukemmeliyetci yapidadir. True dondürmesi icin
        her iki satirin da saglamasi gerekir.


        cay  ve   limon
        +    &&     +  ==> True;
        +    &&     -  ==> False;
        -    &&     +  ==> False;
        -    &&     -  ==> False;
       (3<5 && 3<9 && 11<2 && 4<8 && 2<3 ) False
       (3<5 & 3<9 & 11<2 & 4<8 & 2<3 )     False
       T        T      F    T     T

       cift && operatoru kodun tamamina bakmadan ilk gördugu false degerinde false döndurur.
       Bu nedenle tek & operatorugöre daha hizli calisir.
       Tek & operatoru tüm kodu tarar tek bir false var ise false döndurur ama bunun icin tum kodun
       bitmesini beler. Bu nedenle && operatorune göre daha yavas calisir.


        || ==> veya(or) operatoru Polyanci yapidadir.En ufak bir pozitif durumda True döndurur.

        cay  veya   limon
        +    ||     +  ==> True;
        +    ||     -  ==> True;
        -    ||     +  ==> True;
        -    ||     -  ==> False;

         */
        System.out.println(5+2==8);//false
        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2 !=8;
        System.out.println("sonuc1 = " + sonuc1);// true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 ==9 && 5+2!= 7;
        System.out.println("sonuc2 = " + sonuc2);// false

        int sayi1= 15;
        System.out.println(10< sayi1 || sayi1<20);// true


        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);//true


        short a= 1000;
        System.out.println(a<15000 || a> 28000 || a< -23);

        System.out.println(a<=1000 && a==1000 && a<12);






    }//main
}//class
