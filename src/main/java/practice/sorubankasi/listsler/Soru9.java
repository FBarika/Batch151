package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.List;

public class Soru9 {
    /*
    9) String bir listede verilen tüm fiyatların toplamını bulunuz.
Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double sum=0.0;
        for (String w:myList) {
            w=w.replace("$","");
            sum= sum+ Double.valueOf(w);
        }
        System.out.println("$"+sum);//$91.04

    }
}
