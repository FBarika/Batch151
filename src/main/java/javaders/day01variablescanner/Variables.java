package javaders.day01variablescanner;

import javax.lang.model.SourceVersion;

public class Variables {

    //byte, short, integer,long, double, float
    // veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);//byteMin = -128
        System.out.println("byteMax = " + byteMax);//byteMax = 127
        System.out.println();

        short shortMax = Short.MAX_VALUE;//shortMax = 32767
        short shortMin = Short.MIN_VALUE;//shortMin = -32768
        System.out.println("shortMin = " + shortMin);
        System.out.println("shortMax = " + shortMax);
        //ctrl+Z geri al
        System.out.println();

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);//intMax = 2147483647
        System.out.println("intMin = " + intMin);//intMin = -2147483648
        System.out.println();

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("longMax = " + longMax);//longMax = 9223372036854775807
        System.out.println("longMin = " + longMin);//longMin = -9223372036854775808
        System.out.println();

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("doubleMax = " + doubleMax);//doubleMax = 1.7976931348623157E308
        System.out.println("doubleMin = " + doubleMin);//doubleMin = 4.9E-324
        System.out.println();

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("floatMax = " + floatMax);//floatMax = 3.4028235E38
        System.out.println("floatMin = " + floatMin);//floatMin = 1.4E-45
        
        // non primitive leri developer lar ve Java üretmistir sadce istisna string i java üretmistir. bizim atadigimiz deger ve methodlar icerir
        // primitive data typler i java üretmistir.Sadece bizim atadigimiz deger i icerir.



    } // main body


} //class body

