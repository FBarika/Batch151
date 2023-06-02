package practice.b151practices.day12practice;

public class C03 {
    //Bu class calistiginda output ne olur?Calisma mantigini anlatiniz.
    int fiyat=300000;
    int yil=2023;
    String marka ="Opel";

    public C03(int fiyat, int yil, String marka) {
        this.fiyat=fiyat;
        this.yil=yil;
        this.marka=marka;
    }

    public C03() {

    }

    public static void main(String[] args) {

        C03 obj1= new C03();//burada kizarmadi cünkü her class objenin arkasinda default bir constructor vardir.
        // Ama asagida paremetreli constructor  olusturunca obje arkasindaki default constructor öldü ve kizarmaya basladi bu yüzden parametresiz
        // constructor olusturmamiz gerekecek.
        System.out.println(obj1.fiyat);
        System.out.println(obj1.yil-3);
        System.out.println(obj1.marka.replace("Opel","Mercedes"));//parametresizlerde böyle islem yaparal degistirebiliyoruz.

        C03 obj2 =new C03(500000,2021,"Citroen");//burda kizarda constructor create dedik
        System.out.println(obj2.fiyat+", "+obj2.yil+", "+obj2.marka);

        //note: Instance variable lar objeye baglidirlar. Hangi obje üzerinden degidiklik yapildiysa yapilan o degisiklik sadece o objeyi baglar.
        //switch condition parantezi icerisinde long, boolean, float,ve double kullanilmaz
    }
}
