package practice.sorubankasi.wrapperclasslar;

public class Soru3 {
    public static void main(String[] args) {

        //3) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?
         /*
         parseByte() ilkel tamsayı (primitive integer) tipini (int) döndürürken; valueOf(), ilkel tamsayının
nesne temsilcisi olan Java.lang.Integer'ı döndürür. Primitive türler yerine, bir tamasyı nesnesini
isteyebileceğimiz durumlar da vardır.
Bariz olan bir diğer fark ise; valueOf() bir örnek metod(instance method) iken parseByte() statik
bir metoddur.
parseByte() bir Java programlama dilindeki bir methoddur. Bu method, bir String değerini parametre olarak alır ve bu değeri bir byte veri türüne dönüştürür.

Örneğin, aşağıdaki kod örneği, "15" adlı bir String değerini bir byte veri türüne dönüştürür:

rust
Copy code
String str = "15";
byte b = Byte.parseByte(str);
Bu method ayrıca ikinci bir parametre olarak bir radix (temel sayı sistemi) değeri de alabilir. Varsayılan olarak, radix değeri 10 olarak ayarlanmıştır. Ancak, bu değer farklı bir sayı sistemi kullanıldığında değiştirilebilir. Örneğin, aşağıdaki kod örneği, "FF" adlı bir String değerini onaltılık sayı sistemi kullanarak bir byte veri türüne dönüştürür:

rust
Copy code
String str = "FF";
byte b = Byte.parseByte(str, 16);
Bu kod örneğinde, radix değeri 16 olarak belirlenir, çünkü "FF" değeri onaltılık sayı sistemiyle yazılmıştır.

          */

        String str="15";
        byte b=Byte.parseByte(str);
        System.out.println(b);//15
        int a =15;
        a =Integer.valueOf(str);

        System.out.println(a+2);








    }
}
