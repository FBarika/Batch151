package practice.sorubankasi.loopslar;

public class Soru12 {
    public static void main(String[] args) {
        /*
        12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
         */

        int satir = 4;
        int sütun = 8;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 9; j++) {
                if(i==1){
                    System.out.print("A ");
                }
                if(i>1){
                    if(j==1 || j==8){
                        System.out.print("A ");
                    }else if(j>1 && j<8){
                        System.out.print("X ");
                    }
                }
            }
            System.out.println();
        }






    }
}
