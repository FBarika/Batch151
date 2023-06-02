package practice.smallstudygrup.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_arrays {
    /*
    8.soru Kullanicidan bir array'in boyutunu ve tum elementlerini alarak bir array olusturup,
    bu array bize donduren bir method olusturun
    */
    public static void main(String[] args) {

     arrayOlusturma();
    }

    public static void arrayOlusturma(){
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen kac eleman gireceginizi giriniz");
        int b=input.nextInt();
        int arr []= new int[b];

        for (int i = 0; i <b ; i++) {
            System.out.println("Lütfen elemanlari teker teker giriniz");
            int eleman =input.nextInt();
            arr[i]=eleman;
        }
        System.out.println(Arrays.toString(arr));
    }
}
