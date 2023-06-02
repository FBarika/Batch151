package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {
        /*
        Numeric data type larinin birbirine dönüstürülmesine Type Casting denir.
        Numeric data type lari byte<short<int<long<float<double bunlardir.
        kücük data type larinin buyük data typelarina dönüstürlmesine Auto Widening(otomatik genisletme) denir.
        ==kücük kutunun büyük kutu icerisine yerlestirilmesi


        Buyuk kutunun kucuk kutuya dönüstürülmesinde Java sorumlulugu kabul etmez.
        Data kaybi olabilecegi icin kodu yazanlara birakir.
        Buna Explicit Narrowing (Aciktan daraltma,manuel daraltma) denir.

        */

        byte age = 13;
        int age1 =age;// AutoWidening (otomatik genisletme)

        //long data type nin short a cevirelim

        long population = 123456L;
        short newPopulation = (short) population;// Explicit Narrowing (aciktan daraltma) üzerine gelip tiklayip olusturuyoruz.

        //int data type ni float data type na ceviriniz

        int sayi1 = 45;
        float sayi2 =sayi1;

        //short data type ni byte data type na cevirelim
         short number = 115;
         byte number1 = (byte) number;







    }//main
}//class
