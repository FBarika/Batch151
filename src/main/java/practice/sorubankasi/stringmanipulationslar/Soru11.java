package practice.sorubankasi.stringmanipulationslar;

public class Soru11 {
    /*
    11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
yazınız.
Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
 ‘Ali’ için kodunuz konsolda true yazmalıdır

     */
    public static void main(String[] args) {
        String s=" Ali ";
        String str=s.trim();

        boolean r1=!(s.substring(0,1).equals(" ") && s.substring(s.length()-1).equals(" "));
        System.out.println(r1);

        //2.yol
        boolean r4 =s.equals(str);
        System.out.println(r4);
    }
}
