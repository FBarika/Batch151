package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive    : char-     boolean-    byte-   short-   int-    long-    float-    double
        //Wrapper Class: Character- Boolean-   Byte - Short-   Integer- Long -   Float - Double
        //Wrapper Class lar non-primitive dir. O yüzden memory de cok yer kaplarlar.
        // Böyle bir imkanin varligindan da haberdar olmaliyiz.

        //"n" yazip "nokta" koyarsaniz hic method göremezsiniz.Cunku primitive le method icermez.
        int n = 12;
        //"m" yazip "nokta" koyarsaniz bircok method görebiliriz.Cunku wrapper class lar method icerir.
        Integer m = 12;

        byte p = 13;
        Byte r =13;

        //Ornek 1: short data type inin minimum ve maximum degerlerini kod yazarak bulunuz.
       short maxShort = Short.MAX_VALUE;
       System.out.println("maxShort = " + maxShort);
       short minShort = Short.MIN_VALUE;
       System.out.println("minShort = " + minShort);

       //Örnek 2: int data type nin minimum degeri ile byte data type max. degerlerinin toplamini bulunuz.
        int minInt = Integer.MIN_VALUE;
        System.out.println("minInt = " + minInt);
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("maxByte = " + maxByte);
        int toplam = minInt + maxByte;
        System.out.println("Toplam :" +maxByte+ "+" + minInt + "=" + (toplam));
        // ya da
        int minInt01 = Integer.MIN_VALUE;
        byte maxByte01 = Byte.MAX_VALUE;
        System.out.println(minInt01+maxByte01);

        //Örnek 3 : i) Primitive int i wrapper Integer a ceviriniz.
        int num= 13;
        Integer wrapperNum = num;
        // primitive yani method bulunmayan bir kutudaki degeri alarak icinde bazi methodlar bulunan
        // wrapper kutuya atama yaparsak bu isleme auto boxing denir.

        //ii) Wrapper Byte i primitive byte a ceviriniz.
        Byte k =33;
        byte primitiveK = k;

        //wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak primitive yani method
        //bulunmayan bir kutuya atama yaparsak bu isleme un boxing denir.

        //Örnek 4: i)Primitive char i Wrapper Character e ceviriniz.
        char initial = 'T';
        Character initialWrapper = initial;
                   //ii) Wrapper Boolean i primitive boolean a ceviriniz
        Boolean isOld = true;
        boolean wrapperOld = isOld;









    }
}
