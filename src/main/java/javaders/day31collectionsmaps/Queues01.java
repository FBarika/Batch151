package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese] elemanlari bizim verdigimiz siraya göre dizdi cünkü constructor i LinkedList yaptik!!!!!!!!!!!

        //wareHouse.add(); //ad methodunda baska cesit yok cünkü ilk giren ilk cikacagi icin araya kaynak yapilmasina müsade etmez.

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat ilk elemani silmeden bize verir.copy+paste
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//peek le ayni isi yapar ama queue muz bos bir queue sa peek bize null verir element bize hata verir.
        System.out.println(wareHouse);

        System.out.println(wareHouse.poll());//Meat ilk elemani bize verir ama siler (cut+paste) eleman yoksa null verir remove() methodu hata verir.
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();//tüm elemanlari siler.Warehouse bosaltir.
        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//hata verdi.(Exception)










































































    }//main
}//class
