package practice.sorubankasi.Setsler;

import java.util.HashSet;

public class Soru3 {
    public static void main(String[] args) {
        /*
        3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
Örnek: ‘Mississippi’ ´ Misp
         */
        String s ="Mississippi";
        String str [] =s.split("");
        HashSet<String> hsh = new HashSet<>();
        //1.Yol
        for (String w:str) {

            hsh.add(w);

        }
        //2. yol List<String> characters = Arrays.asList(arr); diye List e ekleyip list i Set<String> mySet = new HashSet<>(characters); bu sekilde set in icine atabiliriz.
        System.out.println(hsh);//[p, s, i, M]
    }
}
