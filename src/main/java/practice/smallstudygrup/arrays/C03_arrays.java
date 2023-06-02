package practice.smallstudygrup.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C03_arrays {
    public static void main(String[] args) {
        /*
        6.Soru -Verilen String bir array'de en uzun
        ve en kisa String'leri yazdıran bir method olusturun
        */
        String isimler[]={"veli","ali","furkan","hasan","huseyin"};
        enUzunVeEnKisa(isimler);
        String isimler1[]={"ankara","adiyaman","rize","izmir"};
        enUzunVeEnKisa(isimler1);
        Arrays.sort(isimler1, Comparator.comparingInt(String::length));//bu siraliyor eleman sayisina göre String leri
        System.out.println(Arrays.toString(isimler1));


    }
    public static void enUzunVeEnKisa(String[]isimler){
        String enUzunKelime=isimler[0]; String enKisaKelime=isimler[0];
        for (int i = 1; i <isimler.length ; i++) {
            if (enUzunKelime.length()<isimler[i].length()){
                enUzunKelime=isimler[i];
            }
            if (enKisaKelime.length()>isimler[i].length()){
                enKisaKelime=isimler[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime : "+enUzunKelime);
        System.out.println("Arraydeki en kısa kelime : "+enKisaKelime);


    }
}
