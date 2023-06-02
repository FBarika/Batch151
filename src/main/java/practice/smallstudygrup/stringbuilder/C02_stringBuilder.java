package practice.smallstudygrup.stringbuilder;

public class C02_stringBuilder {
    public static void main(String[] args) {
        //soru 2)StringBuilder Classindaki ekleme methodlarina bakiniz
        StringBuilder sb=new StringBuilder("Java Cok");
        System.out.println(sb);
        sb.append(" Guzeldir");
        System.out.println(sb);
        sb.insert(5,"bugun "); //araya ekleme bu sekilde index e göre degil lenght e göre ekleniyor.
        System.out.println(sb);
        String str="Hava Bugun Cok Kotu";
        sb.append(str,14,19); // start dahil end dahil degil index olarak sayiyoruz.
        //burada baska bir string ten parca alip sb nin üstüne ekleme yaptik.
        System.out.println(sb);

    }
}