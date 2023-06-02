package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {

    /*
    Java da sonucta bir üründür.Oracle firmasinin bir ürünüdür.Devoloper lar sadace data barindiran primitive data
    type larinin non primitiveler gibi method da barinidirmasini istemislerdir. Bunun üzerine java primitve data typle
    larina method ekleyerek özel bir class olusturmustur.Buna da Wrapper (sarmalama) class denir.

    Primitive                     Non- primitive
    byte           ==>               Byte
    short          ==>               Short
    int            ==>               Integer
    long           ==>               Long
    float          ==>               Float
    double         ==>               Double
    boolean        ==>               Boolean
    char           ==>               Character

     */

    public static void main(String[] args) {

        byte primitiveByte =12;
        Byte wrapperByte = 12;

        //byte data type nin en büyük ve en kücük degerini ekrana yazdiriniz.
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128
        // int data typenin max. degeri ile byte data type nin min. degerinin toplamini hesaplatan methodu
        //olusturn
        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("intMax+byteMin=" + (intMax+byteMin));

        // ************** Primitive Data Type larini Wrapper class lara nasil ceviririz***********

        float primitiveFloat = 12.33F;
        Float wrapperFloat = primitiveFloat;
        //Autoboxing denir ==> Otomatik kutulama Java bunu otomatik yapar.
        // kucuk kutuyu buyuk kutuya kendiliginden yerlestirir.
        // ************ Wrapper Class lari Primitive data typelerina nasil ceviririz.*********
        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar;
        // Unboxing kucuk kutuyu büyük kutudan cikarma java bunu da otomatik yaplar.

        // Ex. Verilen iki String data nin toplamini veren kodu yaziniz.
        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1 + str2);// 12345678

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        // valueOf() ==> String bir datayi wrapper class olan Integer a dönüstürür.
        /*Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar.
         iki String arasinda ya da bir String bir int arasinda ise yanyana yazdirir.
         Buna " Concatination" denir
         java matematik bilir. islem onceligine göre calisir.
         i)  Uslu sayilar
         ii) parantez ici
         iii)carpma/bölme java yukaridan asagi soldan saga calisir ilk carpma görürse onu ilk bölme görürse onu calistirir.
         iiii)toplama/cikarma

         */

        String harf = "A";
        int sayi= 7;
        // harf + sayi ==> A7
        /*
        8+3+"K"

        "K"+3*5/2 //
         */

        String a ="K";
        int b=3,c=5,d=2;
        System.out.println(a+b*c/d);


    }//main
}//class
