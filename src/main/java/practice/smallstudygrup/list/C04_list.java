package practice.smallstudygrup.list;

import java.util.ArrayList;
import java.util.List;

public class C04_list {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki cift ogeleri toplayin
         */
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(28);
        sayilar.add(33);
        sayilar.add(46);
        sayilar.add(87);
        int sum=0;
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)%2==0){
                sum+=sayilar.get(i);
            }

        }
        System.out.println(sum);
    }
}
