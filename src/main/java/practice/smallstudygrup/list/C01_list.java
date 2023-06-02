package practice.smallstudygrup.list;

import java.util.ArrayList;
import java.util.List;

public class C01_list {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */


    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        myList.add(15);
        myList.add(30);
        myList.add(42);
        System.out.println(myList);
        myList.add(2,27);//[15, 30, 27, 42]
        System.out.println(myList);




    }
}
