package javaders.day17multidimensionalarraymehmethoca;

import java.util.Arrays;

public class Multidimensionalarray01 {
    public static void main(String[] args) {

        //Bir array in elemanlari array ise bu multidimesionalarray dir
        //nasil olusturulur?
        int a [][] = new int [3][2];
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]] eleman eklemeden once int data tipinde default deger 0 dir.
        // nasil eleman eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]
        //specific eleman nasil yazdirilir?
        System.out.println(a[0][0]);//5
        // icindeki arrayyler nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[81, 45]
        //kisa yoldan nasil multidimensional array nasil olusturulur?
        String students [][]={{"Ayhan","Beyhan"},{"Cem","Ali"}};

        //Ex: yukaridaki array de kac isim oldugunu yazdiriniz.
        int sum=0;
        for (String w []: students) {
            sum=sum+w.length;
        }
        System.out.println(sum);//4

       //Ex:yukaridaki array de icinde "m" olan isimleri console a yazdiriniz.
        String student [][]={{"Ayhan","Beyhan"},{"Cem","Ali"}};
        for(String w []:student){
            for(String k:w){
                if(k.contains("m")){
                    System.out.println(k);//Cem
                }
            }
        }
        // Ex:Bi integer multidimensionalarray olusturun ve tüm elemalarin carpimini hesaplayiniz.
        int sayilar [][]={{3,4},{5,6,7}};
        int multi =1;
        for(int [] w:sayilar){
            for(int k :w){
                multi=multi*k;
            }
        }
        System.out.println(multi);//2520




    }//main
}//class
