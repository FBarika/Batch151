package javaders.day16arraysforeachloopmehmethoca;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        //1.Yol
        String names []={"K","C","R","A","S"};
        String el ="R";
        int counter=0;
        for(String w :names){
                 if(w.equals(el)){
                     counter++;
                     break;
            }
        }
     if(counter>0){
         System.out.println("Array has ==>"+el);
     }else{
         System.out.println("Array does not have ==>"+el);
     }
     //2.Yol
        Arrays.sort(names);
       int result = Arrays.binarySearch(names,el);//aradigimiz elemanin index ini veriyor.
        System.out.println(result);
        if (result<0){
            System.out.println("aray icinde "+el+ " elemani yok");
        }else{
            System.out.println("aray icinde "+el+ " elemani var");
        }


    }//main
}//class
