package practice.sorubankasi.stringmanipulationslar;

public class Soru14 {
    public static void main(String[] args) {
        /*
        14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
için kod yazınız.

        */
        String s="Java";
        //1.Yol
        boolean r1=s.contains("J");
        System.out.println(r1);
        //2.Yol
        boolean r2 =s.indexOf("J")!=-1;
        System.out.println(r2);
        //3.Yol
        boolean r3 =s.replaceAll("[^J]","").length()>0;
        System.out.println(r3);
    }
}
