package practice.smallstudygrup.accesModifier02;

import practice.smallstudygrup.accesModified01.C01_kullanici;

public class C04_kullaniciRunner extends C01_kullanici {
    static String kullaniciAdi="ahmet";
    static int kullaniciId=112233;
    public static void main(String[] args) {
        C01_kullanici k1=new C01_kullanici();
        System.out.println(k1.kullaniciAdi);
        System.out.println(k1.kullaniciId);
        System.out.println(kullaniciId);
    }
}

