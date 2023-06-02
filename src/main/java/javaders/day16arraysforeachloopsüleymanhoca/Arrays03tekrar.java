package javaders.day16arraysforeachloopsüleymanhoca;

import java.util.Arrays;

public class Arrays03tekrar {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz
        String names [] ={"K","C","L","A","S",};
        String el="K" ;
        //1.yol
        int counter=0;
        for (String w:names) {

           if(names[counter]==el && counter<names.length){
               System.out.println(el + " icinde");

           }else{
               System.out.println(el+ " icinde degil");
           }
            counter++;
            break;
        }
        //2.yol
        int counter1=0;
        for(String w:names){
            if(w.equals(el)){
                counter++;
                break;
            }
        }
        if(counter1>0){
            System.out.println("Array has "+ el);
        }else{
            System.out.println("Array does not have " + el);
        }

        //2.yol bu genel bakiyor."binarySearch()" method hizli arama yapar.
        Arrays.sort(names);
        //1)binarySearch() methodu sort() kullanmadan kullanmayiniz.Cunku binarySearch() mantigi sirali elemanlar icin gecerlidir.
        //2)binarySearch() methodu var olan elemanlar icin size o elemanin index ini verir.
        //3)binarySearch() methodunda aldigimiz index 0 veya 0 dan büyükse bu eleman Array de var demektir.
        //4)binarySearch() methodundan "-" li bir eleman alirsak bu yok anlamina gelir.-3 gibi yazdirdiginda eger olsaydi 3. sirada(index degil sira) olurdu anlamina gelir.
        //5)binarySearch() methodu olmayanlar icin nagatif tam sayi degeri verir
        System.out.println(Arrays.binarySearch(names, "K"));//2
        int result=Arrays.binarySearch(names, "K");
        if(result>0){
            System.out.println(el+" arrayin icinde");//K arrayin icinde
        }else{
            System.out.println(el+" arrayin icinde degil");
        }


    }//main
}//class
