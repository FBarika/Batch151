package javaders.day27interface;
/*
                            INTERFACE DEKI METHODLAR
1)"interface icine concrete method konulamaz.
2)"interface icindeki methodlarin abstarct oldugunu java bilir.
Bu yüzden interface icindeki abstarct methodlarda abstarct keyword kullanmaya gerek yoktur.
3) interface icindeki abstract methodlarin tamami public tir.
Interface icinde abstract method olustururken, access modifier yazmaya gerek yoktur.
4)Bir interface i bir concrete  class in parent i apmak istedigimizde "extends" keyword yerine
"implements" keyword kullaniriz.
5)Concrete Child Class lar "parent interface" deki abstract methodlari override etmek zorundadirlar.
6)"interface" ler bir application da "concrete child class larin yapmak zorunda olduklari fonksiyonlari barindirirlar.
Bu yüzden "interface" lere "to-do-list" de denir.
7)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabiliriz.
Abstract methodlarin body si olmadigi icin child class lar ayni isimli methodlardan herhangi birini override edrek kullanabilirler.
8)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturdugumuzda
bu methodlarin return type lari ayni olmak zorundadir.
9)Normalde interface icinde concrete method konulamaz ama bazi özel durumlarda concrete method koymamiz gerekirse
       i)"default" keyword unu asagidaki gibi kullanarak "interface" icinde concrete method koyabiliriz.
       ii)"static" keyword unu asagidaki gibi kullanarak "interface" icinde concrete method koyabiliriz
10)Default veya static keyword unu kullanarak olusturdugumuz concrete methodlarin,
concrete child class lar tarafindan kullanilma zorunlulugu yoktur.
11)Default keyword unu kullanarak olusturdugumuz concrete methodlara object olusturarak ulasilabilir.
Static keyword unu kullanarak olusturdugumuz concrete methodlara ulasmak icin  object olusturmaya gerek yoktur.
Interface ismi yeterlidir.
12)Interface lerden object olusturulamaz.Interface lerin constructor i yoktur.


 */

public interface Engine {

     void start();
     void payment();

     default void eco(){
          System.out.println("Uses gas less...");
     }
    static void stop(){
          System.out.println("Stops securely...");
     }






}
