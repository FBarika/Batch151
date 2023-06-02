package practice.sorubankasi.Mapsler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Soru1 {
    public static void main(String[] args) {
        /*
        1) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.

         */

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Collection<Integer> sayi= product.values();
        System.out.println(sayi);//[12, 53, 12, 87]
        int sum =0;
        for (Integer w :sayi) {
            sum = sum +w;
        }
        System.out.println(sum);//164
    }
}
