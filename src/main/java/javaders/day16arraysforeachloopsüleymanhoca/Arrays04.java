package javaders.day16arraysforeachloopsüleymanhoca;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Size verilen bir cümlede kac kelime oldugunu gösteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";

        //split methodunu kullandigimizda arrayleri kullanmaliyiz.

        String words []=s.split(" ");// split() methodu bize arrayleri verir.

        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]

        System.out.println(words.length);
        //Size verilen bir cümlede kac harf oldugunu gösteren kodu yaziniz.
        String letters [] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);//28

        










    }//main
}//class
