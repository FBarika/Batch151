package practice.b151practices.day07practice;

import java.util.Arrays;

public class C04_Array {
    public static void main(String[] args) {

        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        int numbers [] ={1,2,-3,4,-5,-6};
        int newNumbers []=new int [numbers.length];
        int idx=0;
        for (int w:numbers) {
            newNumbers[idx]=w*-1;
               /* if (w < 0) {
                    newNumbers[idx] =-1 * w;
                } else {
                    newNumbers[idx] = -1 * w;
                }

                */
            idx++;
        }
        System.out.println(Arrays.toString(newNumbers));

    }//main
}//class
