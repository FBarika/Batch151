package practice.sorubankasi.Mapsler;

import java.util.*;

public class Soru3 {
    public static void main(String[] args) {
        /*
        3) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.


         */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
        //1.yol
        List<Integer> keys = new ArrayList<>(product.values());
        System.out.println(keys);
        Collections.sort(keys);
        System.out.println(keys);
        //2.Yol
        Object[] productNumber = product.values().toArray();
        Arrays.sort(productNumber);
        System.out.println(Arrays.toString(productNumber));


    }
}
