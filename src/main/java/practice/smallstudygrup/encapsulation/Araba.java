package practice.smallstudygrup.encapsulation;
/*
setter() methodlari icin naming convention==> Tum data türleri icin isimler "set" ile baslar.
getter() methodu icin naming convention==>Boolean data türü icin "is" ile, diger data türleri icin "get" ile baslar.
 */
public class Araba {
    private String marka="Honda";
    String model="model belirtilmedi";
    private String yakitturu="benzin";

    public String getYakitturu() {
        return yakitturu;
    }

    public void setYakitturu(String yakitturu) {
        this.yakitturu = yakitturu;
    }

    public String getMarka() {
        return marka;
    }
}
