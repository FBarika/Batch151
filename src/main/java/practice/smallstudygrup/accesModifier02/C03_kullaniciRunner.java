package practice.smallstudygrup.accesModifier02;

import practice.smallstudygrup.accesModified01.C01_kullanici;

public class C03_kullaniciRunner extends C01_kullanici {


    public static void main(String[] args) {
        int kullaniciId=9876;
        C01_kullanici k1=new C01_kullanici("nuri","nuri@gmail.com",5678,"nuri123");
        System.out.println(k1.kullaniciAdi);//nuri
        System.out.println(k1.kullaniciId);//5678
        System.out.println(kullaniciId);//9876




    }
    public static void kullaniciId(){
        System.out.println(kullaniciId);
    }
}