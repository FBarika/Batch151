package javaders.day20arraylistsdatetimesüleymanhoca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListtekrar {
    public static void main(String[] args) {
        //Example 1 : Bir interger list teki birbirine en yakin iki elemani bulunuz.
        // [12,23,10,19] ==> 12 and 10 nu yazdirmaliyiz.

        List<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(23);
        nums.add(14);
        nums.add(10);
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);//[10, 13, 14, 23]
        int fark= nums.get(1)-nums.get(0);
        for (int i =1; i <nums.size() ; i++) {
            fark=Math.min(fark,nums.get(i)-nums.get(i-1));
        }
        System.out.println(fark);//1


    }//main
}//class
