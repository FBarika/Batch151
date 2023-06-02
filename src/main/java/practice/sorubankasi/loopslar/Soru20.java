package practice.sorubankasi.loopslar;

public class Soru20 {
    public static void main(String[] args) {
        /*
        20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
* * * * * *
* * * * *
* * * *
* * *
* *
*
         */
        int satir=6;
        for (int i = 1; i <=satir ; i++) {
            for (int j = satir; j >=i ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
