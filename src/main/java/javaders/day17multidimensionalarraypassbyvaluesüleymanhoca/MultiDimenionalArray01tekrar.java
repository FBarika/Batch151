package javaders.day17multidimensionalarraypassbyvaluesüleymanhoca;

import java.util.Arrays;

public class MultiDimenionalArray01tekrar {
    public static void main(String[] args) {
        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
         //Ex 1: Yukaridaki students array inde toplam kac isim oldugunu bulunuz.
        int sum =0;

        for (String w []:students) {
            sum=sum+w.length;
        }
        System.out.println(sum);//8

         //Ex 2: Yukaridaki students array inde icinde "m" olan isimleri console a yazdiriniz.
        for (String w []:students) {
            for (String w1:w) {
                if(w1.contains("m")){
                    System.out.println(w1);
                }
            }
        }

        //Bir integer multidimensional array olusturunuz tüm elemalarinin carpimini hesaplayiniz.

        int numbers [][]={{3,4,6},{7}};
        int multi=1;
        for (int w []:numbers) {
            for (int num:w) {
                multi=multi*num;
            }
        }
        System.out.println(multi);//504


        // Ex 4: iki boyutlu bir array i tek boyutlu bir array e ceviriniz.

        int num [][]={{3,4,6},{7}};
        int sum1=0;
        for (int w []:num) {
            sum1=sum1+ w.length;
        }
        System.out.println(sum1);

        int newArr []= new int [sum1];
        int idx=0;
        for (int w []: num) {
            for (int w1:w) {
                newArr[idx]=w1;
                     idx++;
            }

        }
        System.out.println(Arrays.toString(newArr));//[3, 4, 6, 7]

        //Ex 5 : Bir integer multidimensional array deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int num1 [][]={{3,4,6},{7}};
        int small=num1 [0][0];
        int big=num1 [0][0];
        for (int w []:num1) {
            for (int w1:w) {
               small= Math.min(small,w1);
                big=Math.max(big,w1);
            }
        }
        System.out.println(small+big);//10








    }//main
}//class
