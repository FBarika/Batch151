package practice.b151practices.day08practice;

import java.util.ArrayList;
import java.util.List;

public class C04_List {
    public static void main(String[] args) {
        /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)

          Output : [Brad,Sofia,Emily]

         */


        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};

        List<String> list =new ArrayList<>();

        for(String w:arr){
            for (String w1:brr){
                if(w1.equalsIgnoreCase(w)){
                    list.add(w1);

                }
            }
        }
        System.out.println("ortak olan elemanlar: " +list);//ortak olan elemanlar: [brad, sofia, emily]














    }//main
}//class
