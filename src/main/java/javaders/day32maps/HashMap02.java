package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Example 1: Verilen cümledeki kelimelerin görünüm sayisini veren kodu yaziniz.
        //"I like you,like like!"  => I=1, like=3, you=1

        String s ="I like you you, like like!";

        //like ile like! ayni yapabilmek icin tüm noktalama isaretlerini silelim.
        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //Ben kelimelerle calismaliyim bu yüzden split(" ") kullanacagim
        String words [] =s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //"words" araryindeki kelimeler birer birer Map de var mi yok mu kontrol edilcek
        //"words" araryindeki kelimeler Map de yoksa Map e value su 1 olarak yerlestirilecek
        //"words" araryindeki kelimeler Map de varsa Map e varolan value 1 artirilarak yerlestirilecek.

        HashMap<String, Integer> occ =new HashMap<>();


        for (String w:words) {
            Integer numOfOccurrence = occ.get(w);// get() methodu Map icinde olmayanlar icin "null" verir.burada Map bos oldugu icin get methodu bize ilk elemanlar eklemlerde "null" verecek
            if(numOfOccurrence==null){           //ama elemanlari tekrar tekrar ekledigimizde önceden ekledigimiz icin null vermeyecek Bu yüzden if de ikinci kisma gidecegiz.
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurrence+1);
            }
        }
        System.out.println(occ);//{like=3, I=1, you=1}







































































    }
}
