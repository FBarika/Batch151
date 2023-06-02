package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru4 {
    public static void main(String[] args) {
/*
4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
 (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
 */
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);//[Yellow, Red, Green, Blue]
        System.out.println(f);//[Blue, Green, Red, Yellow]
        int size=e.size();
        int counter=0;
        for (int i = 0; i <size ; i++) {
            if(e.get(i).equals(f.get(size-1-i))){
                counter++;
            }
        }
        if(size==counter){
            System.out.println("Azalan siradadir.");
        } else {
            System.out.println("Azalan sirada degildir.");
        }


    }
}
