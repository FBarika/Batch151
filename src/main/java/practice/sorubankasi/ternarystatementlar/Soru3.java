package practice.sorubankasi.ternarystatementlar;

public class Soru3 {
    public static void main(String[] args) {
        /*
        3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
 125 yukarı yuvarlanacak ve değer 130 olacaktır.
 123 aşağı yuvarlanacak ve değer 120 olacaktır.
         */
        int i=125;
        int sayi= i%10>=5 ? (i/10*10)+10 : (i/10*10);

        System.out.println("Sonuc: " +sayi);







































































    }
}
