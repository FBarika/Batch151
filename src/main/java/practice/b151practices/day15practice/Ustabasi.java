package practice.b151practices.day15practice;

public class Ustabasi extends Isci{
    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatÜcreti=" + saatÜcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Ustabasi ustabasi1 = new Ustabasi();

        ustabasi1.isim = "Murat";//personal class indan
        ustabasi1.soyIsim="Gökcek";//personal class indan
        ustabasi1.saatÜcreti=15;//muhasebe class indan
        ustabasi1.maas= ustabasi1.maasHesapla(); //muhasebe class indan
        ustabasi1.statu="Isci";//muhasebe class indan
        ustabasi1.isciStatu="Ustabasi"; //isci class indan

        ustabasi1.mesai();//isci class indan
        System.out.println(ustabasi1.isim);
        System.out.println(ustabasi1.toString());//Ustabasi{isciStatu='Ustabasi', saatÜcreti=15, statu='Isci', maas=3600, persNo=0, isim='Murat', soyIsim='Gökcek', adres='null', tel='null'}



    }
}
