package javaders.day25polymorphism;

public class Animal {
    /*
      1)Parent taki method ile child da override edilen method un access modifier i ayni olabilir.
      2)Child da Overrride edilen method un access modifier i Parent taki methodun access modifier indan dar olamaz.
      3)Parent taki methodun access modifier, child daki methodun access modofoerindan dar olabilir.

      4)Method un return type i primitive ise Overriding yapildiginda return type degistirilemez.
      5)Method un return type i void ise Overriding yapildiginda return type degistirilemez.

      6)Child da Overrride edilen method un return type ile parenttaki methodun return type i arasinda
      "IS-A" iliskisi varsa degistirilebilir.Aksi takdirde degistirilemez.
      Mesela; Integer Wrapper class ile Long Wrapper class arasinda IS-A iliskisi yoktur,
      o yuzden return type Integer oldugunda Long a degistrilemez.

      7)Return type Wrapper class oldugunda, Overriding yaparken "return type" degistirilemez.

      8)"final method"lar Override edilemezler.final method degistirilemez method demektir.
      "final method"larin body si degistrilemez ama Override ederken method body i degistririz bu bir celiskidir.
      Bu yüzden java "final methodlarin Override edilmesine müsade etmez.

      9)"static method" lar Override edilemezler.Cünkü static methodlar tüm childlar icin ortak methodlardir.
      Bir child ortak methodu degistridiginde diger child ler bundan etkilenir.Bu etkilenme ummadik sonuclar ortaya cikarabilir.
      Bu yüzden Java "Static method" larin Override edilmesine müsade etmez.

      10)"private method" lar Override edilemez.Biz methodu private yaptigimizda baska class da görünmeyecegi icin override edilemez.
      override da baska class da methodu kullanma söz konusu.
     */
    public void move(){
        System.out.println("Animals move...");
    }
    public int add(int a,int b){
        return a+b;

    }

    public Animal create(){
       return new Animal();
    }

    public Integer multiply (Integer a,Integer b){
        return a*b;
    }

    public final double circleArea(double r){// final lar override edilemez. intellij buna müsadee etmez bile.
        return 3.14*r*r;                     //final methodlarin body si degistirilemeyecegi icin.override da biz body degistiririz.

    }
}
