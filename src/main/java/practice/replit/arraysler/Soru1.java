package practice.replit.arraysler;

import java.util.*;

public class Soru1 {
    /*
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
not: Test datadaki değerleri kullanınız.
Test Data:
[1232, 1134,2345,1022]
```
[Java, Python, PHP, C#, C Programming, C++]
```
Beklenen Çıktı:
```
[1022,1134,1232,2345]
```
[C Programming, C#, C++, Java, PHP, Python]
```
     */
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1232);
        sayilar.add(1134);
        sayilar.add(2345);
        sayilar.add(1022);

        List<String> isimler = new ArrayList<>();
        isimler.add("Java");
        isimler.add("Python");
        isimler.add("PHP");
        isimler.add("C#");
        isimler.add("C Programming");
        isimler.add("C++");

        Collections.sort(sayilar);
        Collections.sort(isimler);
        System.out.println(sayilar);//[1022, 1134, 1232, 2345]
        System.out.println(isimler);//[C Programming, C#, C++, Java, PHP, Python]
    }
}
