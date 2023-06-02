package practice.sorubankasi.stringmanipulationslar;

public class Soru12 {
    /*
    12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
yazınız.
Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
 ‘ali.’ için kodunuz konsolda false yazdırmalıdır
 ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
 ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
 ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
     */
    public static void main(String[] args) {
String str = "ali.";
boolean r1 = str.charAt(0)>='A' && str.charAt(str.length()-1)<='Z' ;
 boolean r2= str.substring(str.length()-1).equals(".");
 boolean r3=r1&&r2;
        System.out.println(r3);
    }
}
