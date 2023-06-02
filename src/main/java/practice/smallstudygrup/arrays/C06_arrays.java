package practice.smallstudygrup.arrays;

import java.util.Arrays;

public class C06_arrays {
    /*
    9.soru-Verilen bir array'e yeni bir element ekleyin
    */
    public static void main(String[] args) {
        int [] a = {2,5,7,9};

        int eklenecek =10;
        int [] newA= new int[a.length+1];
        for (int i = 0; i <a.length ; i++) {
            newA[i]=a[i];
        }
        newA[a.length]=eklenecek;
        System.out.println(Arrays.toString(newA));


    }

}
