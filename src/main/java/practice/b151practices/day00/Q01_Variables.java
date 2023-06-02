package practice.b151practices.day00;

public class Q01_Variables {

    public static void main(String[] args) {
        //Bir variable baslat
        int age = 34;
        int number = 55;
        String isim = "Ali";

        System.out.println(age);
        //number yazip.soutv enter olursa adini da yazdirir
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);
        System.out.println(isim);
        // code sonra reformet code yaparsak yukardan kodu düzenliyor sekillendiriyor.(ctrl+alt+L)
        //Variable degerini kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        //age i hisAge e kopyaladik
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklere et
        int year = 2022, month=3, day=15;
        System.out.println("day = " + day);
        System.out.println("year = " + year);

        // Bir variable degerini güncelle
        year = 2023;
        System.out.println("year = " + year);
        /* year artik int degeri oldugu icin direk degistirmek istedigimiz degeri esittir diyip yaziyoruz.
        yeniden int year yazamiyoruz. int yazacak olursak year01 yazmamiz gerekecek.
         */
        year = 2050;
        System.out.println("year = " + year);
        // tekrar tekrar güncelleyebiliriz.
        year = year+5;
        System.out.println("year = " + year);
        //2055  oluyor
        //Bir variable deklere et :x
        double x;
        //Bir variable başlat : y
        double y = 100.543;
        //Başka bir variable başlat : z
        double z = 43;
        //x değişkenini y değişkeni ile başlat
        x=y ;
        //Variabley'i güncelle
        x=3.14 ;
        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}
