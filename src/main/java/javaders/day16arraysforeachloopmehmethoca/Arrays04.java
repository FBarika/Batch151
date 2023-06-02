package javaders.day16arraysforeachloopmehmethoca;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ex:Size verilen bir cümlede kac tane kelime oldugunu yaziniz.
        String s= "Java is easy. Learn Java earn money";
        String kelime []= s.split(" ");
        System.out.println(Arrays.toString(kelime));//[Java, is, easy., Learn, Java, earn, money]
        System.out.println(kelime.length);//7

        //Ex:Size verilen bir cümlede kac tane kelime oldugunu yaziniz.
        String k= "Java is easy. Learn Java earn money";
        String letters []=k.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);//28




    }//main
}//class
