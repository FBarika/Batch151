package practice.sorubankasi.loopslar;

public class Soru19 {
    public static void main(String[] args) {
        /*
        19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
         */
        String s = "Java is a strongly typed, object-oriented programming language.";
       s= s.replaceAll("[ ]","").replaceAll("[p\\{Punct}]","");
       int a =s.length();
        System.out.println(a);//44



    }

}
