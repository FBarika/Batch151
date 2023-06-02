package practice.smallstudygrup.accesModified01;

public class C01_kullanici {
    public String kullaniciAdi="TechProEd";//herkes gorebilir

    String eposta="TechProEd@gmail.com";//sadece oyunun kuruculari yonetim ekibi ve ben
    protected static int kullaniciId=98765;
    private String sifre="Techpro123";

    public C01_kullanici(){

    }
    public C01_kullanici(String kA,String eposta,int kullaniciId,String sifre){
        System.out.println(sifre);
        System.out.println(kA);
        System.out.println(eposta);
        System.out.println(kullaniciId);
        kullaniciAdi=kA;
        this.eposta=eposta;
        this.kullaniciId=kullaniciId;
        this.sifre=sifre;

    }
    public static void main(String[] args) {
        //System.out.println(sifre);
    }

}