package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.List;

public class Soru11 {
    /*
    11) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
olup olmadığını kontrol ediniz.

     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        int counter=0;
        for (int w:myList) {
            if (myList.indexOf(w) == myList.lastIndexOf(w)) {
               counter++;
            }

        }
        if(counter==0){
            System.out.println("List in tüm elemanlari benzersizdir");
        }else{
            System.out.println("Listte tekrar eden elemanlar var");
        }

    }
}
