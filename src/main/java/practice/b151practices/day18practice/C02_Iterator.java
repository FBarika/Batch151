package practice.b151practices.day18practice;

import java.util.*;

public class C02_Iterator {
    public static void main(String[] args) {
        /*
      Index yapisinin olmadigi yerlerde Iterator kullanmak mantiklidir.List haricindeki Collection üyelerinde index yapisi yoktur.
      */
        /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
       */

        Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(st);//[1, 2, 3, 4, 5]

        Iterator itr = st.iterator();//set lerde index yapisi yoktur.Bu sebeple iterator kullanilir.
                                     //List haric hicbir collections üyesinde index yapisi yoktur.

        while(itr.hasNext()){//iterator un yaninda eleman var mi kontrol ediyorum varsa true yoksa false döndürücek.True oldugu sürece döngü devam edecek.

            Object sayi = (Integer) itr.next();

            if((Integer)sayi%2==0){
               itr.remove();
            }

        }

        System.out.println(st);//[1, 3, 5]

    }
}
