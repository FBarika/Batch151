package practice.sorubankasi.Setsler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Soru2 {
    public static void main(String[] args) {

        /*
        2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.

         */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        myList.retainAll(mySet);
        System.out.println(myList);//[10, 7, 13]


    }
}
