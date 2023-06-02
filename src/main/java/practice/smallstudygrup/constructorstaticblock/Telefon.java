package practice.smallstudygrup.constructorstaticblock;

public class Telefon {
    //soru 2)telefon adli bir constructer olusturun ve
    //olusturdugunuz constructer'a marka model ve fiyat parametreleri ekleyin
    //ve main classi olusturup o class icinden cagirip birkac tane telefon ekleyin
    String marka;
    String model;
    int fiyat;
    Telefon(String marka,String model,int fiyat){
        //  this.marka=marka;
        //  this.model=model;
        //  this.fiyat=fiyat;
        System.out.println("telefonun markasi : "+marka);
        System.out.println("telefonun modeli : "+model);
        System.out.println("telefonun fiyati : "+fiyat+"tl");

    }

    public Telefon(String marka, String model) {
        this.marka=marka;
        this.model=model;
        fiyat=-1;
        System.out.println("telefonun markasi : "+marka);
        System.out.println("telefonun modeli : "+model);
        System.out.println("telefonun fiyati : "+fiyat+"tl");

    }
}
