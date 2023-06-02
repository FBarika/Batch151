package practice.smallstudygrup.stringbuilder;

public class C03_stringBuilder {
    public static void main(String[] args) {
        //soru 3) verilen bir input'u tersine cevirip,
        //donduren bir method olusturun
        StringBuilder sb=new StringBuilder("Java Bugun Cok Guzel");
        sb.reverse();
        System.out.println(sb);
        String str="Java bugun cok guzel";
        tersCevir(str);
    }

    private static void tersCevir(String str) {
        StringBuilder sb=new StringBuilder(str);//burada string i ters cevirmek icin for loop yapmak lazimdi ama burada
        // stringBuilder icine yukaridaki str yi ekledik ve reserve methodu ile ters cevirdik.
        sb.reverse();
        System.out.println(sb);
    }
}