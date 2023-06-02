package practice.sorubankasi.ternarystatementlar;

public class Soru4 {
    public static void main(String[] args) {
        /*
        4) Nested Ternary kullanarak Apex kodunu yazınız.
Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
         */
       int yil=1990;
       String artikYil = yil%100==0 ? (yil%400==0 ? "Artik yil" : "Artik Yil Degil") :(yil%4==0 ? "Artik Yil" : " Artik Yil Degil");
        System.out.println(artikYil);
        /*
        String artikYilMi = (y%100==0) ? ( (y%400==0) ? ("Artik Yil") : ("Artik Yil Degil") ) : ( (y%4==0 ? ("Artik
Yil ") : ("Artik Yil Degil ") ));
         */

















    }
}
