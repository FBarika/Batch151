package javaders.day20arraylistsdatetimesüleymanhoca;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01tekrar {
    public static void main(String[] args) {
        /*
       Example 1 : Kullanicinin girdigi harf list te var ise o harfi "Buldum" a cevirin yoksa o harfi list'e ekleyin
        */
        List<String> myList = new ArrayList<>();// list of ile olusturulan elemanlar degistirilemez.set() methodu kullanilamaz.
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int elemanSayisi =myList.size();

        Scanner input =new Scanner(System.in);
        int counter=0;
        do{
            System.out.println("Lütfen bir harf giriniz");
            String harf =input.next().toUpperCase();
            int idx=myList.indexOf(harf);
            if(idx>=0){
                myList.set(idx,"Buldum");
            }else{
                myList.add(harf);
            }
            counter++;

        }while(counter<elemanSayisi);
        System.out.println(myList);























    }//main
}//class
