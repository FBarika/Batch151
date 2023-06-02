package practice.b151practices.day14practice;

public class Child extends Parent {
    public static void main(String[] args) {
        String ad ="Ayse";
        System.out.println(Parent.isim);//Ali
        System.out.println(isim);//Ali
//static variable ve static methodlari farkli bir class dan cagirabilmek icin class ismi kullanilir
// ama classlar arasinda parent-child iliskisi varsa direk de kullanilablir class ismi olmadan

        isim="Veli";
        System.out.println(isim);//Veli
        System.out.println(soyIsim);//Can bunlar static dikkat
        soyIsim="Tan";
        System.out.println(soyIsim);//Tan


        //Burada parent-child iliskisi oldugu icin static methodlara direkt method ismi ile cagirabilirz.

        method1();//parent static method1
        method2();//parent static method2

        Child obj1= new Child();
        System.out.println(obj1.yas);//30
        obj1.method3();//parent instance method3
        //methodlarda overriding var mi diye bakar varsa child daki override edilmisi alir.

        obj1.method4();

        Parent obj2 = new Parent();
        obj2.method4(); // parent instance method4




















    }
}
