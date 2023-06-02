package practice.smallstudygrup.stringbuilder;

public class C06_stringBuilder {
    public static void main(String[] args) {
        String str="Java";
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        System.out.println(sb1.toString().equals(sb2.toString()));//true ( iki StringBUILDER equals kullanirsak(to String olmadan) == gibi davaranir false verir.)
        System.out.println(str.equals(sb1.toString()));//true
        System.out.println(sb1.equals(sb1)); //true
        System.out.println(sb1.compareTo(sb2)); //0 stringBuilder lar tamamen ayni ise 0 degerini verir bize "compare to"
        //farkli olursa ilk gördügü farkli degerde ascii farki verir bize


         /*
		compareTo() iki stringBuilder'i bastan baslayarak harf harf karsilastirir
        ilk harf ayni ise, ikincisine gecer
        ikinciler ayni ise 3.lere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir
		cikti 0 ise iki stringBuilder ayni degerlere sahiptir
        */
    }
}
