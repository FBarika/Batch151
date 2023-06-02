package practice.gruppractice.corollatoyota;

public class Corolla extends Toyota{
    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit= "Corolla benzinli veya elektriklidir";
    protected String model="Corolla";
    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        Corolla c = new Corolla();
        System.out.println(c.hiz);//Corolla max 200 km hiz yapar
        System.out.println(c.sirketMerkezi);//Japonya
        System.out.println(c.yakit);//Corolla benzinli veya elektriklidir
        c.motor();//Corolla araclar cevreci motor kullanir
        c.garanti();//Toyata araclar 10 yil garantilidir

        Toyota t = new Corolla();
        System.out.println(t.hareket);//Arabalar teker ile hareket eder
        System.out.println(t.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(t.hiz);//Toyota araclar max 220 km hiz yapar
        t.garanti();//Toyata araclar 10 yil garantilidir
        t.yakitTuketimi();//Corolla 5.6 lt yakit tuketir
        t.motor();//Corolla araclar cevreci motor kullanir

        Araba a = new Corolla();
        System.out.println(a.sirketMerkezi);//Almanya
        a.motor();//Corolla araclar cevreci motor kullanir
        a.yil();//1996
        a.yakitTuketimi();//Toyota 8.20 lt yakit tuketir

        //Method'lar Override olmadigi surece Child Class'lara gitmez
        //Diger durumlarda Data type'in (Referans olan yerin) oldugu class'in variable ve method'lari obje icerisine
        //atanir. Ayni zamanda Parent Class'lardaki obje ve Method'larida kullanabiliriz

/*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir
        Method'lar icin ise yine Data turunun oldugu class'a gideriz
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol ederiz
         */






    }//main


}//class
