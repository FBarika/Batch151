package practice.b151practices.day12practice;

public class C02 {
    String isim;
    //Instance ve static variable lara bir deger atamak zorunda degiliz ama local variable lara deger atamak zorundayiz.
    int yas;
    String telefon;

    public C02(String isim, int yas, String telefon) {
        this.isim=isim;
        this.yas=yas;
    }


    public static void main(String[] args) {

        C02 obj1 =new C02("Burak",32,"0246");

        System.out.println(obj1.isim+", "+obj1.yas+", "+obj1.telefon);//Burak, 32, null


    }
}
