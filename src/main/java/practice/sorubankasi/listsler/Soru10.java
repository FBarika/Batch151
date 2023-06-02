package practice.sorubankasi.listsler;

import java.util.*;

public class Soru10 {
    /*
    10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");
        System.out.println(myList);
        List<Double> newArr = new ArrayList<>();//[$12.99, $23.60, $8.25, $54.45]
        for (int i = 0; i <myList.size() ; i++) {
            String str=myList.get(i).replace("$","");
            newArr.add(Double.valueOf(str));
        }
        Collections.sort(newArr);
       Double sonuc= newArr.get(0)+newArr.get(newArr.size()-1);
        System.out.println("$"+sonuc);//$62.7
    }
}
