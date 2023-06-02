package introduction.day02datatypesmethodcreation;

public class Variables01 {
    /*
    java da temelde iki tip data vardir
    1)primitive data type
        char,boolean,byte,short,int,long,float,double
    2)non-primitive data type
    String
     */
    /*
    Note1:primitive data type lari java olusturmustur, biz olusturamayiz.
    Note2:primitive data type larin isimlerinde sadece kucuk harf kullanilir.
    Note3:primitive data lar type larina göre memory de farkli yer kaplarlar
    Note4:primitive data lar iclerinde sadece sizn atadiginiz degeri barindirirlar.
     */
    /*
    Non- primitive Data Types
    Örnek olarak String non-primitive data type dir.
    Üretilen herbir class ayni zamanda bir non-primitive data type dir
    Bu yuzden "non-primitive data type" lar sinirsiz sayida dir denilebilir.
    Non-primitive data type larin isimleri büyük harfle baslar.
    Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
     */
    public static void main(String[] args) {
        //Örnek1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.
        String cityName = "Izmir";
        System.out.println(cityName);

        /*
              Interview sorusu: "primitive" ve "non-primitive" data typelar arasindaki farklar nedir?
              1)"primitive" ler sadece bizim atadigimiz degerleri icerir.
                2non-primitive" ler bizim atadigimiz deger ve methodlar icerir
              2)primitive kucuk harfle baslar non-primitive ler büyük harfle baslar
              3)primitive leri java üretmistir ve 8 tanedir.
                non- primitive lari java ve developer lar üretebilir sinirsiz sayidadir.
              4)primitive ler memory de data type ina göre yer kaplar
                non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
         */
    }


}
