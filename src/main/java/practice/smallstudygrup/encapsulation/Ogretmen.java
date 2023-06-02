package practice.smallstudygrup.encapsulation;

public class Ogretmen {
    /*encapsulation yapilan isin daha anlasilir olmasi icinde kullanilir,
     yani degistireceksek degistir okuyacaksak oku diyerek yapilacak is daha anlasilir olur.
     */
    private String isim;
    private String brans;
    private String soyIsim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }



}
