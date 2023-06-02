package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {
    public static void main(String[] args) {

        /*
           jAVADA char data type'ni matematiksel islemlerde kullanirsaniz
           Ascii Table daki sayisal degerleri alir.

           Numeric Data Type lari: byte-short-int-long-float-double
           char karakterin hem sayisal deger barindirir hem de resim karakteri barindirir.
           boolean ==> numeric olmayan data type dir.
           Javada char data type ina int deger de atanabilir sembol harf vs de atanabilir.
           cunku char data type inin Ascii den gelen bir sayisal == numeric bir degeri
           bir de resim karakteri vardir.

       */

        // 'A' karakterinin ascii degerini hesaplatan kodu yaziniz.

        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA);//asciiA = 65
        int asciia = 'a';
        System.out.println("asciia = " + asciia);//asciia = 97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//asciiUnlem = 33

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);//asciiSpace = 32

        /*int asciiHiclik = '';// burda hic bosluk olmayacak hicligin degeri yok 2 tane space de olmuyor.
        System.out.println("asciiHiclik = " + asciiHiclik);

         */


        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);//asciiSembol = 42

        String isim ="Barika";
        char ch ='Z';
        char sembol ='*';
        char isaret ='?';
        char space =' ';
        //char sayi ='50'; bu sekilde yazamayiz. 50 tek sembol degil iki tane ama '5' yerlestirilebilir.
        //int intCh =Z; böyle olmaz int sayisal deger barindirmali.

        //149.9999 Tl *2
        int deger = 20;
        char sembol2 ='$'; // $ ascii de 36 oldugu icin tam sayi ile toplama yaptigimizda ascii degeri ile toplama yapilir.
        System.out.println(deger+sembol2);// $ Ascii tabledaki degeri 36+20=56


        int deger2 = 0 ;
        char sembol3 = '+';
        System.out.println("deger2+sembol3 = " + deger2 + sembol3);
        // 0+ sonucunu verir. yanda String oldugu icin concat yaptigi icin resim gibi yazdirir.
        System.out.println("deger2+sembol3 = " + (deger2 + sembol3));//deger2+sembol3 = 43
        // bu sekilde yazarsak parantezli concat yapmiyor.
        System.out.println(deger2+sembol3);//43

        /*
         Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar.
         iki String arasinda ya da bir String bir int arasinda ise yanyana yazdirir.
         Buna " Concatination" denir
         java matematik bilir. islem onceligine göre calisir.

         */
        String name ="Suzan";
        int number = 998;
        System.out.println(name+number);//Suzan998
        String name1 ="100";
        int number1 = 998;
        System.out.println(name1+number1);//100998  buna concatination denir.

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        System.out.println(str1+str2+sayi1);//JavaGuzel5

        String str3 ="Java";
        char ch3 = 'G';
        int sayi4 = 5;
        System.out.println(str3+ch3+sayi4);//JavaG5
        System.out.println(str3+(ch3+sayi4));//Java76 parantez icinde char ascii degeri ile toplar öyle yazdirir.
        System.out.println(ch3+sayi4+str3);//76Java java soldan saga okur o yüzden ascii degerle toplar.!!!!!

        System.out.println("123" + "732456");//123732456

        char rakam1 ='1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);//rakam1+rakam2+rakam3+rakam4 = 1234
        // icerde string bir ifade oldugu icin yan yana yazdirmaya devam eder resim gibi.
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " +(rakam1 + rakam2 + rakam3 + rakam4));//rakam1+rakam2+rakam3+rakam4 = 202
        // Ascii table daki degerlerini aldi
        // Javada char data type'ni matematiksel işlemlerde kullanirsaniz,Ascii table daki sayisal degerleri alir.
        System.out.println(rakam1 + rakam2 + rakam3 + rakam4);//202 int sepetinde olsaydilar cevap 10 olurdu ama char sepetinde
        //olunca ascii degerlerini aldik.


        //***************Ascii degerlerinden faydalanilarak neler Yapilabilir?*************
        byte b=5;
        char ch2='h';

        int asciih ='h';
        System.out.println("asciih = " + asciih);//104
        int ascii5 ='5';
        System.out.println("ascii5 = " + ascii5);//53

        System.out.println("b > ch2 = " +( b>ch2));//false 5>104==false b konteyner inin ici zaten numeric bir data tipi

        long l=542168784578L;
        System.out.println("ch2>l :"+(ch2>l ));// false

        float f= 2.45648f;
        double d = 2.19658;
        System.out.println("f>d :"+ (f>d));//t

        System.out.println("b<f:"+(b<f));//false

        byte sayi3 =5;
        byte sayi5 = 6;
        System.out.println("sayi3<sayi5:"+(sayi3<sayi5));//true

        int sayiInt =100;
        long sayiLong = 100L;
        System.out.println("sayiInt<sayiLong = " + (sayiInt < sayiLong));//false
        System.out.println("sayiInt==sayiLong = " + (sayiInt == sayiLong));//true

        int sayiInt1 =200;
        long sayiLong2 = 100L;
        System.out.println("sayiInt1>=sayiLong2 = " + (sayiInt1 >= sayiLong2));//true

        int sayiInt3 = 9;
        char sayiChar= '9';// ascii degeri 57
        System.out.println("sayiInt>=sayiChar:"+ (sayiInt>=sayiChar));//false

        int ascii9='9';
        System.out.println("ascii9 = " + ascii9);

       /* String str = "Alpay";
        String str1 ="Ayse";
        System.out.println("str>str1 = " + str > str1);
        burada kiyaslama yapmaz ikis de resim olarak yansittigi icin numeric olmadigi icin
        kiyaslama yapmaz.
        */



    }//main

}//class
