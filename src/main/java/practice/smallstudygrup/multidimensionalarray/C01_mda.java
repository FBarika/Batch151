package practice.smallstudygrup.multidimensionalarray;

import java.util.Arrays;

public class C01_mda {
    public static void main(String[] args) {
        /*
        soru 1)  bir multi-dimensional array olusturun
        ve olusturdugunuz arrayin elemanlarini yazdırınız
         */
        int arr[][]={{1,2,3},{11,22,33,44},{111,222,333,444,555}};
        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [11, 22, 33, 44], [111, 222, 333, 444, 555]]
    }
}
