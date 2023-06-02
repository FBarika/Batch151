package practice.sorubankasi.arraysler;

import java.util.Arrays;

public class Soru11 {
    /*
    11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
     */
    public static void main(String[] args) {
        int sayilar[] ={5,0,2,0,0,3};

        for (int i = 0; i < sayilar.length ; i++) {
           int counter=0;
            if (sayilar[i]==0){
                counter++;
                sayilar[i]=sayilar[sayilar.length-counter];
                sayilar[sayilar.length-counter]=0;
            }

        }
        System.out.println(Arrays.toString(sayilar));
    }
}
