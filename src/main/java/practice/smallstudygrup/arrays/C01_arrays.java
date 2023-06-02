package practice.smallstudygrup.arrays;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {

        int sayilar[]={5,4,3,2,1};
        int temp=sayilar[0];
        for (int i = 0; i <sayilar.length-1; i++) {
            sayilar[i]=sayilar[i+1];
            System.out.println(Arrays.toString(sayilar));
        }
        sayilar[sayilar.length-1]=temp;
        System.out.println(Arrays.toString(sayilar));

    }
}
