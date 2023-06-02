package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {
        //3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        List<Integer> myList= new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int result=1;
        for (Integer w:myList) {
            if(w%2==0){
                result=result*w;
            }
        }
        System.out.println(result);






    }
}
