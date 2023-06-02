package javaders.day33maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //HashMap arkasinda calisan mekanizma nasil calisir?

        HashMap<String,String> capitals =new HashMap<>();
        //Biz HashMap olusturdugumuzda Java memory de 16 tane kutu olusturur ve bu kutulari indexler.Bu kutular bostur Bu kutulara Bucket(16) denir

        capitals.put("USA","Washington");// mesela USA icin 34 hashcode üretir onu 16 ya böler kalan 2 ye ürettigi HashCode+USA+Washington u ekler.
                                         //biz get() methodu ile cagirdigimizda ürettigi hashcode ile USA bulur verir bize.
        //Java Hashing Tecnic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
        //Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode", "key" ve "value" u koyar.
        //Bir bucket'a istediginiz kadar entry koyabilirsiniz

        capitals.put("Italy","Roma");//buna mesela 65 üretti hashcode u 16 ya böldügümüzde kalan 1, 1. index e 65+Italy+Roma seklinde yerlestirir.

        capitals.put("Turkey","Ankara");//buna 82 degeri atadi 16 ya böldügümüzde 2 kaldi 2 de entry olmasina ragmen bucket a bunu da yerlestirir.
        //Biz Turkiye'yi bir kere daha koyarsak, Turkiye icin uretilen hashcode ayni olur, yeni bir hashcode uretmez.
        //bir Bucket a istedigimiz kadar entry koyabiliriz.
        //Java bucket larin icinde LinkedList kullanir.Java index i ayni cikanlari LinkedList yapisi icinde kullanir birbirine bagli olarak yani.


        capitals.get("Turkey");//get() methodunu kullandigimizda Java ürettigi hashcode ile o index ten bulup cikarir karisiklik olmaz cünkü Java ilk basta ürettigi hashcode biliyor.


      /* baskasinin notu!!!!!!!!!!
      HashMap<String, String> capitals=new HashMap<>(); olusturdugumuzda Java memoryde 16 kutucuk olusturur
 ve o kutulari siarasiyla 0'den 15'ya kadar indexler. Kutularin ici bostur. Bu kutulara bucket denir.
 HashMap ilk olusturuldugunda kutular bostur.

 capitals.put("USA", "Washington"); yazdigimizda, java ilk isim icin bir hashcode uretir. Java key icin 34 hashcode ürettigini farzedelim
 Bu hashcode'u 16'ya boler. 34:16 kalan 2'yi verir. Java kalana odaklanir ve indexi 2 olani bulur, sonra
 bos kutu olan yani 2.inci indexteki bucket'a once hashmap kodu olan 34'u koyar, yanina USA onun yanina
 Washington'i koyar.

 capitals.get("USA"); methodunu kullanirken, java USA icin urettigi hashkodu bildiginden onu bize verir.

 capitals.put("Italy", "Roma"): yazdigimizda key olan Italy icin bir hashcode mesela 65'i uretecek
 ve 16'ya bolecek. kalan 1'dir. Java indexi bir olan bucket'in uc bolmeli yapisinda ilk bolmeye 65, 2.ye
 Italy, 3. bolmeye Roma'yi koyar.

 codun 16'ya bolunmesi halinde 16 index olarak siralan bucket'larin disina kalanlar ile cikilmamis olacak.

capitals.put("Turkiye", "Ankara"); bunun codu ornegin 82. 82/16 kalan 2, Java onceden doldurulmus olsada
2. index'e uc bolmeli bir entry daha ekleyecek ve once 82, sonra TR ve sonra Ankara'yi yazacak.

Java bucketlar icinde LinkedList kullanir. Entryleri birbirine bagliyor. Indexte birden fazla entry olduysa
onlari node yapisi gibi birbirine baglar.

capitals.get("Turkiye"); Java Turkiye icin olusturdugu hashcode'i biliyor 82. 82 index 2'de.
Java buraya gelerek 82'yi alir.

Biz Turkiye'yi bir kere daha koyarsak, Turkiye icin uretilen hashcode ayni olur, yeni bir hashcode uretmez.

capitals.put("Turkiye", "Istanbul"); Java onceden urettigi 82'yi bilir ve index 2'ye gider. Orada iki
entry olsa da 82'yi secer ancak hashcode'a dokunmayan java Ankara yerine Istanbul yazar.
       */


        /*
        Biz eleman ekledikce bu bucket lar zamanla dolar.Java varolan 16 tane bucket in 12 tanesi doldugunda yeni bir 16 verir.Java artik 32 ye bölecek.
        Java bunu kendisi yapar ideal hizi yakalamak icin ve bucket larin ici sismesin diye.
         */








    }
}
