package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    public static void main(String[] args) {
        /*
        5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
         */
        List<Integer> numbers =new ArrayList<>();
        numbers.add(12);
        numbers.add(11);
        numbers.add(15);
        numbers.add(34);
        numbers.add(43);
        for (Integer w:numbers) {
            if(w==15){
                int idx=numbers.indexOf(15);
                numbers.set(idx,51);
            }
        }
        System.out.println(numbers);//[12, 11, 51, 34, 43]













    }
}
