package practice.sorubankasi.loopslar;

import java.util.Arrays;

public class Soru30 {
    public static void main(String[] args) {
        /*
        30) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.
         */
        String str="Kemal Can Kuzu Ali";
        String arr []=str.split(" ");
        String ters ="";
        String s =arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {

        }
        arr[arr.length-1]=s;
        System.out.println(Arrays.toString(arr));
    }
}
