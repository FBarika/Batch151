package javaders.day24inheritancepolymorphism;

public class Car {
    /*
    1)Inheritance da constructor lar object olustururken constructorlar yukaridan(Parent) asagiya (child)
    dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor in ilk satirinda görünmez olarak bulunur.
    Isterseniz görünür sekilde de yazilabilir.super(); bu sekilde görünür olarak yazabiliriz.
    4)super() sizi parent class taki constructor a tasir.
    4) "super ()" sizi parent class'daki (parametre istemeyen) constructor'a tasir.
    5) this() sizi ayni class icindeki constructor lar arasinda gezdirir.
    6) this() icinde bulundugunuz class taki variable lari cagirmaya yarar.
       super() parent class taki variable lari cagirmaya yarar.
   7) Eger data type lari arasinda "IS-A" ve "HAS-A" iliskisi varsa bu data typelarina "COVARIANT" denir.
     */

    /*  POLYMORPHISM
       1)Polymorphism==> coklu sekil
        Yani bir methodun farkli sekillerde karsimiza cikmasi demektir.
        Polymorphism= Overloading + Overriding
        2)Overrriding, parent class taki methodu child class in ihtiyaclarina göre özellestirerek kullanmak demektir.
        3)Overrriding de methodun body si degistirilir.Overloading te parametre degistiriliyordu.
        4)Overrriding de method signature a dokunulmaz.Dokunursak Java kizar.signature isim+parametre kismi.
     */

    public void move(){

        System.out.println("Cars move...");
    }
    public void getbreak(){

        System.out.println("Cars break...");
    }
    public void engine(){

        System.out.println("Cars have engine...");
    }


    public String model="Car";
    public int price=0;

    public Car(){

        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }

    //Butun Constructor'larin ilk satirinda gorunmez bir kod vardir ==> super();
    //Bu kod Parent'i temsil eder ve parent'e yonlendirir

    /*
    Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
Super parent demektir. O yuzden once parent'e gidilir.
Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.

Constructor lar inheritance ta yukaridan asagi calisir.

parent class Super classla es anlamlidir
child class sub classla es anlamlidir.

     */







}
