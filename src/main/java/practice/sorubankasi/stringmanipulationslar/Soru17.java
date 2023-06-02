package practice.sorubankasi.stringmanipulationslar;

public class Soru17 {
    public static void main(String[] args) {
        /*
        17) Bir String’de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        */
        String s="ejfzv)*.,?)";
       int a= s.replaceAll("[\\P{P}]","").length();
        System.out.println(a);
    }
}
