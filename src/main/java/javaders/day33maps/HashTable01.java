package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    HashMap ile HashTable arasinda fark nedir?
    1)HashMap "thread-safe" degildir; HashTable "thread-safe" dir(coklu is yapip yapmamak demektir.)
      HashMap "synchronized" degildir; HashTable "synchronized" dir
    2)HashMap bir tane null key e ve istedigimiz kadar null value ya müsade eder.
      HashTable key lerde de value larda da null kullanilmasina müsade etmez.
    3)HashMape hizlidir; HashTable HashMap e göre yavastir.Cünkü multi-thread olma ve synchronized olma gibi islerle ugrastirdigi icin.
    Note: ikisi de entry leri rastgele siralar.

     */
    public static void main(String[] args) {

        Hashtable<String,Integer> stdAges=new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85);==> Hashtable larin key lerine null konulamaz.
        //stdAges.put("Chris",null);==> Hashtable larin value larina da null konulamaz.
        // Ama HashMap lerde null key lerde de value larda da kabul edilir!!!!!

        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}

        stdAges.elements();//bunu ögren!!!!!!
        System.out.println(stdAges);

    }
}
