package javaders.day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {

        // ***************** ExplicitNarrowing******************

        /*
        Explicit Narrowing yaparken dikkat edilmeli cunkü cok ciddi data kaybi hatta datanin degismesine neden
        olabilir. Eger dönüstürmeye calistigimiz variable sinirlari disinda ise java sayiyi mod islemine alir
        ve kalani yazdirir.

        Kalan bolenin yarisindan fazlaysa kalan sayiyi java kücültmek ister ve bölümü bir büyüterek kalani (-)
        isaretli olacak sekilde yazdirir.

         */

        // short data type inde bir variable olusturup byte data type ina ceviren kodu yaziniz
        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);//numByte = 4  260/256 ya böldü kalani (4) ü verdi 256 ==> -128 +127 arasindaki rakam sayisi

        short num2 = 1023;
        byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte);//-1 oluyor 1023/256=4 kalan -1  bölünce kalan -1 oluyor
        //Kalan 256 nin yarisindan fazla ise bölüm bir fazlasini alip kalan eksili oluyor.

        short num3 = 1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte);//-24 kalan==-24

        int intSayi = 8880;
        short shortSayi= (short) intSayi;// -32768 ile 32768 araliginda oldugu icin short deger bu aralikta oldugu icin kücülttügümüzde ayni kaliyor.
        System.out.println("shortSayi = " + shortSayi);//8880


    }//main
}//class
