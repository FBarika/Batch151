package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru7 {
    public static void main(String[] args) {
        //7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        System.out.println(h);//[12, 13, 15, 31, 54]
        int min=h.get(2)- h.get(1);

        for (int i = 0; i <h.size()-1 ; i++) {
            min=Math.min(min,h.get(i+1)-h.get(i));
        }
        System.out.println(min);

        for (int i = 0; i <h.size()-1; i++) {
            if(h.get(i+1)-h.get(i)==1){
                System.out.print(h.get(i+1)+" ");
                System.out.println(h.get(i));
            }
        }















































































    }
}
