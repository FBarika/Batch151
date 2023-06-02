package practice.sorubankasi.loopslar;

public class Soru22 {
    public static void main(String[] args) {
        /*
        22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
        */

        for (int i = 3; i <9 ; i++) {
            if(i==5){
                continue;
            }
            System.out.print(i+" ");//3 4 6 7 8
        }
    }
}
