package practice.smallstudygrup.multidimensionalarray;

public class C03_mda {
    public static void main(String[] args) {
        /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int arr[][]={{1,2,3},{11,22,33,44},{111,222,333,444,555}};
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);










        /*
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (i==j){
                    sum+=arr[i][j];
                }else System.out.println(arr[i][j]);

            }
            System.out.println("-----------------");
        }
        System.out.println(sum);


         */
    }
}