package practice.sorubankasi.loopslar;

public class Soru13 {
    public static void main(String[] args) {
        //13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.

        int sum=0;
        for (int i = 3 ; i <14 ; i++) {
            sum=sum+i;
        }
        System.out.println("Sonuc: "+sum);//88
    }
}
