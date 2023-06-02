package practice.replit.forwhileler;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
Input :
30
40
	Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 2 tane tam sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int GCD=0;
        for (int i = 1; i <=sayi1 ; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println(GCD);

        int max=sayi1*sayi2;
        int LCM=0;
        for (int i = max; i>0 ; i--) {
            if(i%sayi1==0 && i%sayi2==0){
                LCM=i;
            }
        }
        System.out.println(LCM);







    }
}
