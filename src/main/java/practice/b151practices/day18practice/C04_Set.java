package practice.b151practices.day18practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {
        /*
    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun

         */
        int arr[]={1,2,2,3,4,4,5};
        System.out.println(Arrays.toString(benzersizYap(arr)));//[1, 2, 3, 4, 5]
    }
    public static int[] benzersizYap(int [] arr){
        Set<Integer> tekrarsizSet = new TreeSet<>();
        for (int w:arr) {
            tekrarsizSet.add(w);
        }
        System.out.println(tekrarsizSet);//[1, 2, 3, 4, 5]

        int arr2 [] = new int[tekrarsizSet.size()];
        int idx=0;
        for (int w:tekrarsizSet) {
            arr2 [idx] =w;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5]
        arr=arr2;
        return arr;
    }
}
