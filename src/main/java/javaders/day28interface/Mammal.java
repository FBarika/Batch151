package javaders.day28interface;
/*
  Child   Parent
1)Class-->Class : extends
  interface-->interface : extends
  Class-->interface : implements
  interface-->Class: Olamaz.
  Ayni ise "extends", farkli ise "implements" kullan.
  interface i Class in child i yapma!!!


  "abstract" class ile "interface" arasindaki farklar nelerdir?
  1)abstract class lar hem abstract hem de concrete methodlar icerebilir fakat interface ler sadece abstract method icerir.
   Ama interface lerde istersek default ve static keyword lerini kullanarak concrete method üretebiliriz.
  2)abstract class lar multiple inheritance i desteklemez  ama interface ler destekeler.
  3)Abstract class lar icinde her türlü variable olusturulabilir, interface ler icinde variable lara public, static ve final olmak zorundadir.
  4)interface i Class in child i olamaz ama "abstract class" class in child i olabilir.
  5)abstract class larda constructor vardir ama object üretemez; interface lerde constructor yoktur bu yüzden object üretilemez.



 */

public interface Mammal extends Animal{
    String feedBaby="Milk";
    int age =6;










}
