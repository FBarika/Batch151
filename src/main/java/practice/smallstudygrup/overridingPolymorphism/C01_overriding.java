package practice.smallstudygrup.overridingPolymorphism;

public class C01_overriding {
    public String str="parenntaki String";
    public String yazdirma(){
        String str="parenttaki yazdirma methodu calisti";
        return str;
    }
    public void yazdirma(String str){
        System.out.println("parenttaki parametrelerli yazdirma methodu calisti");
    }

//Overriding yapildiginda parent class taki methoda Overridden Method denir;
// child class daki methoda Overriding Method denir.

//Overriding method covariant return type kullanmalidir.Mesela String ken Object olabilir override
//private,static ve final methodlar overriding yapilamazlar.
//Child class Parent class i sinirlayamaz.mesela child protected ken parent public olamaz.


    //Overloading bir compile time(static) polymorphisim dir. parametreler degisiyor
    //Overriding bir run time (dynamic) polymorphisim dir. body degisiyor.
}
