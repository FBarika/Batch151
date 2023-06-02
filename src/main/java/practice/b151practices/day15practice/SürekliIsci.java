package practice.b151practices.day15practice;

public class SürekliIsci extends Isci{
    @Override
    public String toString() {
        return "SürekliIsci{" +
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


        SürekliIsci surIc1= new SürekliIsci();

        surIc1.persNo=5001;//personal class indan
        surIc1.isim="Cem";//personal class indan
        surIc1.soyIsim="Oz";//personal class indan
        surIc1.statu="Isci";//muhasebe class indan
        surIc1.saatÜcreti=11;//muhasebe class indan
        surIc1.maas= surIc1.maasHesapla();//muhasebe class indan

        System.out.println(surIc1.persNo);//5001

        System.out.println(surIc1.toString());//SürekliIsci{isciStatu='Sürekli Isci', saatÜcreti=11, statu='Isci', maas=2640, persNo=5001, isim='Cem', soyIsim='Oz', adres='null', tel='null'}



    }

}
