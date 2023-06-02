package practice.sorubankasi.loopslar;

public class Soru17 {
    public static void main(String[] args) {
        //17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int n = 753;
        int sum=0;
        for (int i = n; i >0 ; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println(sum);//15


    }
}
