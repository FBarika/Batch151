package practice.sorubankasi.Mapsler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Soru2 {
    public static void main(String[] args) {
        /*
        2) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
yazınız.
Map<String, Integer> product = new HashMap<>();
product.put("Laptop", 12);
product.put("TV", 53);
product.put("Refrigerator", 12);
product.put("Music System", 87);
         */

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop",12);
        product.put("TV",53);
        product.put("Refrigerator",12);
        product.put("Music System",87);
        Set<String> keys = product.keySet();
        System.out.println(keys);//[Laptop, TV, Refrigerator, Music System]
        //1.yol
        if(keys.contains("Laptop")){
            System.out.println("mevcut");
        }else{
            System.out.println("mevcut degil");
        }
        //2.yol
        String expectedProduct = "Laptop";
        if(product.containsKey(expectedProduct)){
            System.out.println(expectedProduct + " vardir");
        }else{
            System.out.println(expectedProduct + " yoktur");
        }
    }
}
