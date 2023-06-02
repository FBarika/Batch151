package practice.b151practices.day17practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {
     // Bir tane txt dosyası olusturunuz.
     // txt dosyasının icerisine cumleler yazınız
     // Olusturdugunuz txt dosyasına ulasınız.
     // icerisindeki cumleleri yazdırınız

    /*
     Bir kod yazilirken olasi exceptionlari öngörüp exception olustugunda javanin ne yapmasini istedigimize karar vermeliyiz.
     1)Eger exception olustugunda kodun calismasini istemiyorsak method ismin yanina olusabilecek exceptioni deklare ederiz.
     2)Eger exception olustugunda kodun calismasini istiyorsak, sorun olusturabilecek kodu try blogun icine yazmaliyiz.
     catch bloguna ise exception durumunda Java nin ne yapmasini istedigimizi yazmaliyiz.
     */
    /*
     Exceptionlar icin parent child iliskisi mevcuttur eger bir code icin birden fazla exception olusma ihtimali varsa; öncelikla olasi
     exceptionlar, parent child iliskisi tasiyor mu bakmamiz gerekir.Eger parent child iliskisi yoksa istedigimiz sirada catch cümleleri olusturabiliriz.
     Eger parent child iliskisi varsa sadece parent exception i yazariz veya ikisini de yazmak istersek child i önce parent i sonra yazariz.
     */

public static void main(String[] args) {//exception olustugunda kod calismaya devam etmesin diyorsak ve main method yanina exception i deklare ederek bunu yapiyoruz
    String dosyaYolu ="src/main/java/practice/b151practices/day17practice/dosya.txt";//mesela bu adreste degisiklik yaparsam ,bozarsam main method daki exception i aticak.

    try {//try catch yaparsak kod calismaya devam etsin diyoruz.
        FileInputStream fis=new FileInputStream(dosyaYolu);//dosya lara böyle ulasiriz.
        int k=0;
        while((k=fis.read())!=-1){//burada read kizariyor ve  java  dosyayi okuyamazsam diyor alt satirdaki try catch i ekledik java yi rahatlatmak icin
            System.out.print((char)k);//harf harf yazdirmak icin int i char a cevirdik.
        }

    } catch (FileNotFoundException e) {//ya dosyaya ulasamazsam
      //  e.printStackTrace();
        System.out.println("yoluma devam ediyorum1");
    } catch (IOException e) {//ya dosyayi okuyamazsam
      //  e.printStackTrace();//exception i bana ayrintili göster ama programa durdurma diyoruz bunu yazarak.Bunu sonda yazan exit code 0 dan anliyoruz.
        System.out.println("yoluma devam ediyorum2");
    }


       }//main
}//class
