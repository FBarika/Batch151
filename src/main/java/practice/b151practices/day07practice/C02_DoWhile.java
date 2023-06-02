package practice.b151practices.day07practice;

import java.util.Scanner;

public class C02_DoWhile {
    public static void main(String[] args) {
        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir yükseklik giriniz.");
        double yükseklik=input.nextDouble();
        double toplam =0;
        int counter=0;

        do{
            toplam=toplam+yükseklik;
            counter++;
            toplam=toplam+yükseklik/2;
            yükseklik=yükseklik/2;

        }while(yükseklik>=1);
        toplam=toplam+yükseklik;
        counter++;
        System.out.println(toplam);
        System.out.println(counter);


    }
}
