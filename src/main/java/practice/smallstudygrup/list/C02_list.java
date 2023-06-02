package practice.smallstudygrup.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_list {
    public static void main(String[] args) {
         /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        List<String>sehirler=new ArrayList<>();
        sehirler.add("Mersin");
        sehirler.add("Amasya");
        sehirler.add("Ankara");
        sehirler.add("Izmir");
        System.out.println(sehirler);
        Collections.sort(sehirler);
        System.out.println(sehirler);


    }
}
