package practice.b151practices.day14practice;

public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım

    //bunlar static  variable ve methodlar
   protected static String isim= "Ali";
   protected static String soyIsim= "Can";

   protected static void method1(){
       System.out.println("parent static method1");
   }
   protected static void method2(){
       System.out.println("parent static method2");
   }




   //bunlar static olmayan variable ve methodlar

   protected int yas=30;

   protected void method3(){
       System.out.println("parent instance method3");
   }

    protected void method4(){
        System.out.println("parent instance method4");
    }
}
