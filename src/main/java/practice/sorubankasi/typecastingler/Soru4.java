package practice.sorubankasi.typecastingler;

public class Soru4 {
    /*
    4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
Sonrasında bu short değişkenin değerini konsolda yazdırınız.
Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır
     */
    public static void main(String[] args) {
      double sayi1 = 3.6;
      short sayi2= (short) sayi1;

        System.out.println(sayi2);//deger kaybi oldu ondalik kismi düstü exciplit narrowing ile
    }
}
