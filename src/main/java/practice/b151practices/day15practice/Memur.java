package practice.b151practices.day15practice;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatÜcreti=" + saatÜcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    //to String() methodu objelerin tüm özelliklerini yazdirmak icin pratik bir yöntemdir.

    public static void main(String[] args) {
        Memur memur1= new Memur();
        //memur1 objesi ,memur class inin objesi olmasina ragmen inherit ettigi muhasebe
        // ve onun da parent i olan personal classindaki tüm datalari alabilir.

        //personal classindan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="312456785";

        //muhasebe class indan
        memur1.saatÜcreti=10;
        memur1.statu="Memur";
        memur1.maas = memur1.maasHesapla();

        System.out.println(memur1.persNo); //1001
        System.out.println(memur1.maas);// 2400

        System.out.println(memur1.toString());//Memur{saatÜcreti=10, statu='Memur', maas=2400, persNo=1001, isim='Ahmet', soyIsim='Tepe', adres='Ankara', tel='312456785'}

        Memur memur2= new Memur();

        memur2.persNo=1002;//personal class indan

        memur2.saatÜcreti=10;//muhasebe class indan
        memur2.maas=memur2.maasHesapla();//muhasebe class indan

        System.out.println(memur2.toString());//Memur{saatÜcreti=10, statu='null', maas=2400, persNo=1002, isim='null', soyIsim='null', adres='null', tel='null'}
        //artik bu fabrikada istedigimiz kadar memur üretebiliriz.
        //Ürettigimiz her memur, muhasebe class indaki ve personel class indaki tüm özellikleri inherit etmis olur.





    }








}
