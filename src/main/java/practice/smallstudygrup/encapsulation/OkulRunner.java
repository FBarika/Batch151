package practice.smallstudygrup.encapsulation;

public class OkulRunner {
    public static void main(String[] args) {
        Okul okul1=new Okul();
        System.out.println(okul1.getOkulIsmi());
        System.out.println(okul1.getMudur());
        System.out.println(okul1.getMudurYardimcisi());
        System.out.println(okul1.getSinifSayisi());
        //okul1.ogrenciSayisi=okul1.ogrenciSayisi-200;
        okul1.setOgrenciSayisi(okul1.getOgrenciSayisi()-200);
        okul1.setOgretmenSayisi(okul1.getOgretmenSayisi()-3);
        System.out.println(okul1.getOgrenciSayisi());
        System.out.println(okul1.getOgretmenSayisi());
    }
}
