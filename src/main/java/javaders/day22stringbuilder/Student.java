package javaders.day22stringbuilder;

public class Student {
    //stdName public oldugu icin diger class lardan ulasabilir.
    public static String stdName ="Ali Can";
    // Access Modifier i "default" olan ile "public" olan class member lar ayni package icinde
    //icinde kullanildiklarinda ayni özellikleri gösterirler.
    //Fakat farkli package a gectiginizde "public" olanlara ulasilabilir,"default" olanlara ulasilmaz.
    int age =23;
    //Access Modifier i "private" olan class Member lar sadace olusturulduklari class icinden görülebilirler.
    //Olusturulduklari class in disina ciktigimizda görünmez,ulasilmaz olurlar.
    private String healtCondition = "Cancer";

    //Access Modifier i "protected" olan class member lar ayni package icinde iken "public" gibi davranirlar.
    //Farkli package gectigimizde "protected" olanlar sadece child class lardan görülebilir.Default ile protected farki;
    // protected child class lar tarafindan görülebilir ama default farkli package de child olsa bile görünmeyecek.
    protected int salary =3000;

    //class lar private yapilamaz. Class lar kaliptir private yaptigimizda kimse ona ulasamaz bu da mantikli degil.
    // Eger access modifier yazmazsak o default demektir.
    //Class lar ayni zamada protected olamazlar.
    //Class lar default olabilirler.
    // Classlar public ve dafault olabilir ama private ve protected olamazlar.

    //public de olursa ister ayni package te ol ister farkli package te ol her türlü ulasilabilir.
}
