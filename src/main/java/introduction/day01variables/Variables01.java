package introduction.day01variables;

public class Variables01 {


    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskasina aciklamadir.
           /*
           java bu satirlari da okumaz.Aciklamada Türkce karakter kullanilabilir ama kullanilmasi daha iyi.
            */


        // Variable olusturma
        //data type + variable name + atama operatörü + data + noktali virgul
            int             age               =          13            ;


        // java cümlesi ==> Statement
        // Data Type + Variable name ==> Variable Declaration
        //Assignment Operator(atama operatoru) + Variable degeri ==> Assignment
        // Eger variable Declaration yapar assignment yapmazsaniz Java kendi degerlerini (dafault ==> varsayilan ) koyar
        //Default degerler sayilar icin sifirdir.
        // Dilbilgisindeki nokta ne ise javadaki noktali virgul ayni seydir ve statement in bittigini gösterir
        // javada esittir demek "==". Yani matematikte "=" , java da "=="

               /*
                   Java da temelde iki tip data vardir
                   1)primitive data type:
                   char,boolean,byte,short,int,long,float,double
                   2)non-primitive data type:
                   String
                */
        // örnek 1: ögrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        String studentName = "Ali Can";
        // variable isimleri her zaman kucuk harfle baslar.
        // String lere verilen degerler daima cift tirnak icinde olmalidir.


        // String bir variable olusturup ona herhangi bir atama yapmazsak java o variable a default olarak "null" koyar
        // null demek 0 demek degil, 0 da coding te bir degerdir
        // null demek ici bos obje demektir.
        // yani icinde variable veya method bulunmayan default obje demektir.
        //{}==> bos küme=null {0} ==>1 elemani var


        // char Data Type:
        // tek karakterler icindir. örnegin==> A;x,?,5
        //Ornek 2 : char data type inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note : char data type inda degerler tek tirnak icine konulmalidir

        char isminIlkHarfi = 'A';
        // charda degerin icine 5 yazarsak artik o sayi degil char dir


        // boolean Data Type:
        // boolean lar sadece iki farkli deger alabilir; true(dogru) ya da false (yanlis)
        //ornek 3: boolean data type inda emekli misin icin bir variable olusturun ve false degerini atayin

        boolean emeklimisin = false;

        //byte Data Type:
        // tam sayilar icindir hafizada 1 bit yer kaplar
        // byte : -128 den +127 ye kadar tam sayi degerleri icin kullanilir
        //ornek 4: byte data type inda ögrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte studentAge = 23;


        //short Data Type:
        // tam sayilar icindir hafizada 2 byte (16 bit) yer kaplar
        // short : -32768 ile 32767 arasindaki tam sayilar icin kullanilir
        // ornek :5 Site nufusu icin bir variable olusturun ve deger atayiniz
        short siteNufusu = 23456;

        //int Data Type:
        // tam sayilar icindir hafizada 4 byte(32 bit ) yer kaplar
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        // örnek 6: Ulke nufusu icin bir variable olusturun ve deger atamasi yapin
        int countryPopulation = 186478463;

        //long Data Type:
        // tam sayilar icindir hafizada 8 byte(64 bit) yer kaplar
        // long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //ornek 7: insan vücudundaki hücre sayisi icin variable olusturup deger atamasi yapiniz

        long cellNummerInHumanBody = 1234567867876L;

        // Note: Bir deger long ise sonuna "L" (tercih edilir ) veya "l" konulur
        // Eger long a atadiginiz deger int lerin araliginda ise sonuna "L" koymaya gerek yok
        // long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder

        long weightOfSun = 13456788;
        // int deger icinde ise java L koymasak bile kirmizi yanmaz int olarak kabul eder.

        //float Data Type:
        // float data type virgüllü sayilar icin kullanilir (ondalikli sayilar==> Decimal Numbers)
        // float hafizada 4 byte(32 bit) yer kaplar
        //Note: java ondalikli sayilari yani "Decimal Numbers" i otomatik olarak "double" kabul eder
        // eger float data type i olmasinda israr ederseniz sonuna F ya da f koymaliyiz.
        // ornegin fiyatlandirmalar icin tercih edilebilir(12.99)
        //Örnek 8: gömlek ve ayakkabi fiyatlari icin iki tane variable olusuturup toplam fiyati ekrana yazdiriniz.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;

        System.out.println(shirtPrice + shoesPrice);
        // System.out.println(); yazdirmanin kisayolu ==> sout yaz ve enter a bas
        int a = 12;
        int b = 13;
        System.out.print(a);
        System.out.println(b);// ln sonradan pointer i asagi indirmek icin yazdik.
        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar // ln line kisaltilmasi
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar

        // double Data Type:
        // double data type virgüllü sayilar icin kullanilir (ondalikli sayilar==> Decimal Numbers)
        // double memory de daha fazla 8 byte(64 bit) yer kaplar, virgülden sonraki rakam daha fazla alir.
        // örnek 8: Hücre agirligi ve Amipin agirligi icin iki tane variable olusturunuz ve agirliklari farkini console a yazdiriniz

        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;

        System.out.println(weightCell - weightAmip);


    }

}
