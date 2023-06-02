package practice.smallstudygrup.overridingPolymorphism;

public class C02_overriding extends C01_overriding {
    public String str="childdaki String";
    public String yazdirma(){
        String a="childdaki yazdirma methodu calisti";
        return a;
    }
    public void yazdirma(String a){
        System.out.println("childdaki parametreli yazdirma methodu calisti");
    }

    public static void main(String[] args) {
        C02_overriding obje = new C02_overriding();
        obje.yazdirma();
        System.out.println(obje.str);
        C01_overriding obje1=new C02_overriding();
        obje1.yazdirma();//childdaki yazdirma methodu calisti
        System.out.println(obje1.str);//parenttakini yazdirir.
        C01_overriding obje2=new C01_overriding();
        obje2.yazdirma(); //parenttakini yazdirma yazdirir
        System.out.println(obje2.str); //parettaki str yazdirir
        obje1.yazdirma("a");
        obje.yazdirma("a");
        obje2.yazdirma("a");

    }
}
