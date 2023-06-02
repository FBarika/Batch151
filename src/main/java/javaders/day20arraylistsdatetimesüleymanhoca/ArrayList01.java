package javaders.day20arraylistsdatetimesüleymanhoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    /*
    1)String Class kullanmak tercih edilir cünkü String Class method acisindan cok zengindir.
    2)List.of() methodu ile eleman ekleyebiliriz ama bu elemanlar degistirilemez.
                  i) List lerin elemanlari degistirilemez.
                  ii)Bu listlere eleman eklenemez.
                  iii)Bu Listler den eleman silinemez.(remove() ile mesela)
     */
    /*
    Example 1 : Kullanicinin girdigi harf list te var ise o harfi "Buldum" a cevirin yoksa o harfi list'e ekleyin
    */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();// list of ile olusturulan elemanlar degistirilemez.set() methodu kullanilamaz.
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size =myList.size();

        Scanner input =new Scanner(System.in);
        int counter =0;
        do {

            if(counter==size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1);


            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "Buldum");// set() methodu ile degistirmek istedigimiz seyin index ini yazip bir de yerine koymak istedigimiz seyi yaziyoruz.
            } else {
                myList.add(letter);
            }

            counter++;
        }while(true);
       /*
        List<Integer> m= List.of(12,13,43);
        m.add(34);
        System.out.println(m);// burda hata veriyor list ile olusturdugumuz icin ekleme yapamiyoruz.

        */













    }//main
}//class
