package practice.sorubankasi.wrapperclasslar;

public class WrapperClassilk2Soru {
    public static void main(String[] args) {
        //1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        //bulmak için bir kod yazınız.
       byte number1=Byte.MAX_VALUE;
       short number2=Short.MIN_VALUE;
        System.out.println(number1+number2);//-32641

        //2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.

        Byte byt = Byte.valueOf("103");
        Short shrt= Short.valueOf("2351");
        System.out.println(byt+shrt);//2454






    }
}

