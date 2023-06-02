package practice.sorubankasi.stringmanipulationslar;

public class StringManipulationilk8Soru {
    public static void main(String[] args) {
        //1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        /*Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.

         */
        String s =" mIAMI ";
        String yeni= s.trim().toLowerCase();
        yeni=yeni.substring(0,1).toUpperCase()+yeni.substring(1);
        System.out.println(yeni);//Miami

        //2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.
        String k="fatma barika";
        String k1="burak karaduman";
        String k2="beyza lina";
        int c1=k.replaceAll("\\s","").length();
        int c2=k.replaceAll(" ","").length();
        int c3=k.replaceAll(" ","").length();
        System.out.println(c1+c2+c3);//33

        //3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String d=" Miami 33018!!! ";
       int d1= d.trim().replaceAll(" ","").replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(d1);

        //4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
        String h ="1a3Bcf4!...";
        int h1=h.replaceAll("[0-9]","").length();
        System.out.println(h1);//8

        /*
        4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
         */
        String rakam="1a3Bcf4!...";
        int sayi=rakam.replaceAll("[0-9]","").length();
        System.out.println(sayi);//8

        /*
        5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
karakteri yazdırınız.
          Örnek:'Ali Can' için n yazdırmalısınız.
         ‘Miami’ için i yazdırmalısınız.
         */
        String örn ="Ali Can";
        String son =örn.trim().substring(örn.length()-1,örn.length());
        System.out.println(son);//n

        /*
        6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.
         */

        String f = "Miami";
        int ch = f.charAt(0)+f.charAt(f.length()-1);
        System.out.println(ch);//182

        /*
        7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
yazdırınız.
Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
         */
        String l="Java";
        l=l.replace(l.substring(0,1),"");
        System.out.println(l);//ava

        /*
        8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */

        String p="Java";
        String son1=p.toUpperCase().substring(0,p.length()-1);
        System.out.println(son1);//JAV









    }
}
