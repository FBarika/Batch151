package javaders.day03methodcreationscanner;

public class C03_MethodCreation {
    /*
    Javada method nasil olusturulur?
    1)Java da method main in disinda olusturulur.
    2) tekrar tekrar kullanmamiz gerekiyorsa method olustururuz.
    Access Modifier + Return Type + methodIsmi + ()+{}
    islem yapilacak olan sayilari methodIsmi () parantezin icine eklenir.

    Scope ==> Kapsam alani bir variable nin bir degerin hangi alanda kapsam icinde oldugunu gösterir.


     */
    public static void main(String[] args) {
        //1) Verilen iki sayiyi toplayan methodu olusturunuz.
        add(20,54);
        //2) Verilen iki sayiyi carpan medthodu yaziniz.
        multiply(46,12);
        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        System.out.println("ilk iki sayiyi carp ucuncuyu ekle :" + firstTwoMultiplyThirdAdd(5, 6, 7)*2);

        //4) Verilen bir ondalikli sayinin küpünü hesaplayip kullandiran bir method olusturunuz.
        double sayininKupu = getCube (5.6);
        System.out.println("sayininKupu = " + sayininKupu);// burda double sepetine koyduk

        // ya da
        System.out.println("Sayinin kupu= "+ getCube(5.6));// burada direk sout methodu icinde kullandik ikisi de ayni

        //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
        System.out.println("dairenin cevresi = " + daireninCevresi(4));

    }//main


    private static double daireninCevresi(double r) {

        return 314*2*r/100;
    }


    static double getCube(double a) {

        return a*a*a;
    }

    public static int firstTwoMultiplyThirdAdd (int a, int b, int c) {
       return a*b+c;
    }

    private static void multiply(int a, int b) {
        System.out.println("carpma sonucu : "+ a*b);

    }

    static void add(int a, int b) {// Access Modifier default oldugu icin bir sey yazilmadi.
         System.out.println("toplama sonucu :"+a+b);

    }

// void oldugunda main icindeki variable larda islem yapilmiyor method eklenmiyor
// ama return type int oldugu zaman yukarida sout yapabiliyoruz method ekyebiliyoruz.
}//class
