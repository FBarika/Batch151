package practice.b151practices.day16practice;

public class Corsa extends Opel {
    protected String hiz="Corsa max 200 km hiz yapar";
    protected String yakit="Corsa benzinli veya elektriklidir.";
    protected String model="Corsa";

    protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIR");
    }

    protected void yakitTüketimi(){
        System.out.println("CORSA 5.6 LT YAKIT TÜKETIR.");
    }

    protected void vitesSayisi(){
        System.out.println("CORSA 5 VITESLIDIR");
    }

    public static void main(String[] args) {
        /*
        inheritance variable;
        Olusturdugumuz objenin data türü hangi class a aitse oradan baslayarak bakar yoksa parent ina gider, ilk buldugu yerden alir.
        inheritance Methodlar;
        Olusturdugumuz objenin data türü hangi class a aitse oradan baslayarak bakar yoksa parent ina gider,
        Buldugu yerden hemen almaz,override edilmis mi diye kontrol eder.
        Constructor class ina kadar ayni isimde method var mi diye kontrol eder.Override edileni alir.

         */
       Corsa arb1=new Corsa();
        System.out.println(arb1.hareket);//Arabalar teker ile hareket eder.
        System.out.println(arb1.hiz);//Corsa max 200 km hiz yapar
        System.out.println(arb1.yakit);//Corsa benzinli veya elektriklidir.
        System.out.println(arb1.marka);//Opel
        System.out.println(arb1.sirketMerkezi);//Almanya
        System.out.println(arb1.model);//Corsa

        arb1.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR

        Opel arb2 = new Corsa();

        System.out.println(arb2.hareket);//Arabalar teker ile hareket eder.
        System.out.println(arb2.hiz);//Opel arabalar max 220 km hiz yaparlar.
        System.out.println(arb2.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(arb2.marka);//Opel
        System.out.println(arb2.sirketMerkezi);//Almanya
        //System.out.println(arb2.model); CTE verir.

        //methodlarda override edilmis mi önce kontrol etmemiz gerekir.
        arb2.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR
        //motor() methodu override edildigi icin olusturdugumuz Obje nin Constructorindaki class a bakacagiz.

        arb2.garanti();//OPEL ARABALAR 2 YIL GARANTILIDIR. override edilmemis
        arb2.yakitTüketimi();//CORSA 5.6 LT YAKIT TÜKETIR. override edilmis
        // System.out.println(arb2.vitesSayisi);CTE verir.Burada Corsa class inin icnde vitesSayisi() methodu olmasina ragmen
        // obje kisminda Opel oldugu icin oralara bakip varsa eger override edilmis mi diye bakacagiz. Opel e ve parent i olan
        // Araba class inda vitesSayisi() methodu olmadigi icin override edilmis mi diye bakmiyoruz.



        Araba arb3 = new Corsa();
        System.out.println(arb3.hareket);//Arabalar teker ile hareket eder.
        System.out.println(arb3.hiz);//Arabalar motor gücüne göre hiz yapar.
        System.out.println(arb3.yakit);//Arabalar farkli yakitlar kullanabilir.
        System.out.println(arb3.marka);//Arabalar üretildikleri markaya sahiptir.
        //System.out.println(arb3.sirketMerkezi); CTE
        //System.out.println(arb3.model);CTE burada child larda variable lar childlara inemiyoruz variable a bakmak icin

        arb3.yakitTüketimi();//CORSA 5.6 LT YAKIT TÜKETIR. yakit tüketimi override edildigi icin en son nerede override edildiyse onu alicak.
        arb3.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR motor() methodu en son Corsa class inda override edildigi icin onu aliyoruz.

        //System.out.println(arb3.garanti); CTE verir. objemizin data türü Araba class i oldugu icin önce ona bakiyoruz orada garanti() methodu
        //olmadigi icin override edilmis mi diye bakmiyoruz



    }
}
