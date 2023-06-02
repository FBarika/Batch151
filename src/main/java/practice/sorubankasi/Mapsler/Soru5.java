package practice.sorubankasi.Mapsler;

import java.util.Arrays;
import java.util.HashMap;

public class Soru5 {
    public static void main(String[] args) {
        /*
        5) Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
(Büyük/küçük harfe duyarlı değil)

         */
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s=s.replaceAll("\\p{Punct}","").replaceAll(" ","").toLowerCase();
        String [] arr = s.split("");
        System.out.println(Arrays.toString(arr));//[A, p, e, x, i, s, e, a, s, y, T, y, p, e, c, o, d, e, s, t, o, l, e, a, r, n, a, p, e, x, T, o, e, a, r, n, m, o, n, e, y, l, e, a, r, n, a, p, e, x]
        HashMap<String,Integer> hsh = new HashMap<>();
        for (String w:arr) {
            Integer a = hsh.get(w);
            if(a==null){
                hsh.put(w,1);
            }else{
                hsh.replace(w,a+1);
            }
        }
        System.out.println(hsh);//{a=7, c=1, d=1, e=10, i=1, l=2, m=1, n=4, o=4, p=4, r=3, s=3, t=3, x=3, y=3}




    }
}
