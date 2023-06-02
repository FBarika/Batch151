package javaders.day23inheritance;

public class Animal {
    /*
    1)eat() methodu gibi bircok class in kullanmasi gereken methodlari her class a ayri ayri yazarsak;

      i) tekrar yapmis oluruz, tekrar ideal code da olmamalidir.
      ii)Ayni methodu tekrar tekrar yazmak zaman kaybidir.
      iii)Tekrar tekrar yazilan methodun tamiri cok zaman alir.
      iv)Tekrar tekrar yazilan methodun gelistirilmesi cok zaman alir.
      v) Methodu tekrar tekrar yazmak "atomic yapi" ya terstir.
    2)private class member lar child class lar tarafindan kullanilamaz..
      public class member lar child class lar tarafindan kullanilabilir.
      default class memberlar ayni package te public gibi davranirlar.Child class member lar tarfindan kullanilabilir.
      protected class member farkli packagede de olsa child class lar tarafindan kullanilabilir.
    3) Java da bir class in sadece bir tane parent i olabilir.
      Coklu parent a "Multiple Inheritance" derler, tekli parent a "Single Inheritance" derler.
      Java "Multiple Inheritance" desteklemez, Java "Single Inheritance" kullanir.
    4)Apartman seklindeki Inheritance yapisina "MultiLevel Inheritance" denir. Java "Multilevel Inheritance" destekler.
     */
     public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }























}
