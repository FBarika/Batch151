package javaders.day16arraysforeachloopsüleymanhoca;

import java.util.Arrays;

public class Arrays04tekrar {
    public static void main(String[] args) {

        String s = "Java is easy. Learn Java earn money.";
        //Size verilen bir cümlede kac kelime oldugunu gösteren kodu yaziniz.

        String newArr []=s.split(" ");
        System.out.println(Arrays.toString(newArr));//[Java, is, easy., Learn, Java, earn, money.]

        //Size verilen bir cümlede kac harf oldugunu gösteren kodu yaziniz.

        String s1=s.replaceAll("[^a-zA-Z]","");
        String newArr1 []=s1.split("");
        System.out.println(Arrays.toString(newArr1));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]






    }//main
}//class
