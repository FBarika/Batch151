package practice.sorubankasi.loopslar;

import java.util.Scanner;

public class Soru25 {
    public static void main(String[] args) {
        /*
        25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
için bir kod yazınız.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= input.nextInt();
        int a=0;
        int sum=0;
        for (int i = sayi; i >0 ; i=i/10) {
            a=i%10;
            sum=sum+a*a*a;
        }
        System.out.println(sum);
        if(sayi==sum){
            System.out.println("Sayi Armstrong tur.");
        }
    }
}
