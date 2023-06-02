package javaders.day17multidimensionalarraymehmethoca;

import java.util.Arrays;
import java.util.Scanner;

public class MD02 {
    public static void main(String[] args) {
        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }
        int elemansayisi =0;
        for (int w []:numbers) {

                elemansayisi=elemansayisi+w.length;
        }
        System.out.println(elemansayisi);
        int newnumbers [] = new int[elemansayisi];

        int idx=0;
        for (int w [] : numbers) {
            for (int w1:w) {
                newnumbers[idx]=w1;
                idx++;
            }

        }

        System.out.println(Arrays.toString(newnumbers));//[5, 4, 2, 3, 2]

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int big= ages[0][0];
        int small=ages[0][0];
        for (int w []:ages) {
            for (int w1:w) {
                small=Math.min(small,w1);
                big=Math.max(big,w1);
            }
        }
        System.out.println(big+small);//47







    }//main
}//class
