package practice.b151practices.day12practice;

public class C01 {
    //Bu class calistiginda output ne olur calisma mantigini anlatiniz.
    //Instance variable lar class seviyesinde olusturulur ve objeye baglidirlar.
    String isim="Hasim";
    int yas =20;

    public C01(String isim, int yas) {
        this.isim=isim;
        this.yas=yas;

    }

    public C01() {

    }

    public static void main(String[] args) {
        //instance variable lara main method icerisinden ulasabilmemiz icin obje olusturmamiz gerekiyor.
        C01 obj1 = new C01("Nuri",25);//buraya parametre girince constructor i da parametreli olusturduk otomatik olarak.

        System.out.println(obj1.isim+", "+obj1.yas);

        C01 obj2 =new C01();
        System.out.println(obj2.isim+", "+obj2.yas);






    }


}
