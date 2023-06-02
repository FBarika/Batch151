package practice.sorubankasi.Mapsler;

import java.util.*;

public class Soru4 {
    public static void main(String[] args) {
        /*
        4) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.

         */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);


        Set<String> productNamesAsSet = product.keySet();
        List<String> productNamesAsList = new ArrayList<>(productNamesAsSet);
        Collections.sort(productNamesAsList);
        System.out.println(productNamesAsList);

    }
}
