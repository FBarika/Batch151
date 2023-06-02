package practice.sorubankasi.Setsler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Soru4 {
    public static void main(String[] args) {
        //4) Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
        //bir kod yazınız.

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(12);
        myList.add(20);
        myList.add(32);
        myList.add(40);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(20);
        mySet.add(41);
        mySet.add(12);
        mySet.add(51);
        mySet.add(32);
        mySet.add(60);

        mySet.removeAll(myList);
        System.out.println(mySet);//[51, 41, 60]


    }
}
