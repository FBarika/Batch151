package practice.smallstudygrup.list;

import java.util.ArrayList;
import java.util.List;

public class C03_list {
    public static void main(String[] args) {
         /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(36);
        sayilar.add(42);
        sayilar.add(64);
        sayilar.add(21);
        int sum=0;
        for (Integer a:sayilar){
            sum+=a;
        }
        System.out.println(sum);


    }
}
