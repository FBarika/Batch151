package practice.smallstudygrup.passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_passByValue {
    public static void main(String[] args) {
 /*
        bir list olusturalim iki ayri method'dan
        birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim
        ve her iki method call'dan sonra
        kendi listemizi main method icerisinde kontrol edelim
         */

        List<Integer> myList=new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        System.out.println("elemandegistir methodundan once : "+myList);//elemandegistir methodundan once : [3, 5, 7]
        elemanDegistir(myList);//method icinde : [8, 2, 54]
        System.out.println("elemandegistir methodundan sonra : "+myList);//elemandegistir methodundan sonra : [8, 2, 54]
        listDegistir(myList);//list degistir methodunu icinde : [12, 24, 36]
        System.out.println("list degistir methodundan sonra : "+myList);//list degistir methodundan sonra : [12, 24, 36]



    }

    public static void listDegistir(List<Integer> myList) {
        List<Integer>newList=new ArrayList<>(); //yapisini ancak yeni bir list olusturarak bozabiliriz.
        newList.add(12);
        newList.add(24);
        newList.add(36);
        System.out.println("list degistir methodunu icinde : "+newList);

    }

    public static void elemanDegistir(List<Integer> myList) {
        myList.set(0,8);
        myList.set(1,2);
        myList.set(2,54);
        System.out.println("method icinde : "+myList);//buarada elemanlari degistirsek veya eleman eklesek listin yapisi degismedigi icin korunmuyor.
        //ama mesela int list i String yaparak yapisini degistirebiliriz.
    }
    /*
birden fazla eleman iceren array ve arraylist gibi yapilarda passByValue gecerli
eger method'da array veya arrayList'in kendisi degistirilirse
passByValue ozelligi sebebiyle java degisen degeri degil array ve list'teki orjinal degeri alioydu

array ve list degistirilmeden icindeki degerler degistilirse java obje degismedigi icin (referans ayni)
ayni array ve listteki elemanlari bize dondurur ancak elemanlar degismis olur.
 */

}
