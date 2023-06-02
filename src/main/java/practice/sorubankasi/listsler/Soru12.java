package practice.sorubankasi.listsler;

import java.util.ArrayList;
import java.util.List;

public class Soru12 {
    /*
    12) Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
yazınız.
Not:
Mountain Array ==> [0, 2, 5, 3, 1]
Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
     */
    public static void main(String[] args) {
     List<Integer> sayilar = new ArrayList<>();
     sayilar.add(0);
     sayilar.add(2);
     sayilar.add(3);
     sayilar.add(8);
     sayilar.add(7);
     sayilar.add(5);
     sayilar.add(6);

        System.out.println(sayilar);//[0, 2, 5, 6, 8, 1]
     int a =sayilar.get(0);
     int counter=0;
        for (int i = 0; i < sayilar.size() ; i++) {
            a=Math.max(a,sayilar.get(i));
        }
        System.out.println(a);
        for (int i = 0; i <sayilar.size()-3 ; i++) {
            if((sayilar.get(i)<sayilar.get(i+1)) && (sayilar.get(i+1)<sayilar.get(i+2))){
                if(sayilar.get(i+2)==a){
                    if(sayilar.get(i+2)>sayilar.get(i+3)){
                        counter++;
                    }
                }

            }
        }
        if(counter>0){
            System.out.println("evet");
        }else{
            System.out.println("degil");
        }
    }
}
