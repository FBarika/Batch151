package practice.replit.arraysler;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Array deki sayıları tolpayan Java kodunu yazınız.
array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Beklenen Çıktı:
Array toplamı: 55
        */
        int [] sayilar ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        for (int w:sayilar) {
            sum=sum+w;
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println(sum);//55
    }
}
