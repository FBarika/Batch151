package practice.sorubankasi.stringmanipulationslar;

public class Soru15 {
    public static void main(String[] args) {
        /*
        15)

Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
         */
        String a = "$12.99";
        String b = "$35.99";
        a=a.replace("$","");
        b=b.replace("$","");
        double sayi1=Double.valueOf(a);
        double sayi2=Double.valueOf(b);
        System.out.println("Sonuc: "+(sayi1+sayi2)+"$");
    }
}

