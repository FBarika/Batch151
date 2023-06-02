package practice.sorubankasi.Mapsler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Soru6 {
    public static void main(String[] args) {
        /*
        6) Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
        */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer,Integer> tekrar= new HashMap<>();

        for (Integer w:myList) {
            Integer a = tekrar.get(w);
            if(a==null){
                tekrar.put(w,1);
            }else{
                tekrar.replace(w,a+1);
            }

        }
        System.out.println(tekrar);//{35=1, 21=2, 12=3, 13=1}




    }
}
