package practice.smallstudygrup.arrays;

public class C02_arrays {
    public static void main(String[] args) {
        int arr[]={90,101,42,20,37,15};
        maxSayiYazdir(arr);
    }


    public static void maxSayiYazdir(int[]arr){
        int maxSayi=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>maxSayi){
                maxSayi=arr[i];
            }
        }
        System.out.println(maxSayi);


    }
}

