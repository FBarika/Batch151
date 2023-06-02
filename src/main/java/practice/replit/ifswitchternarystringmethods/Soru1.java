package practice.replit.ifswitchternarystringmethods;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez
Input:
Output:
Agirlik : 71
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        int kilo=input.nextInt();
        System.out.println("lütfen boyunuzu giriniz");
        double boy=input.nextDouble();
        if((kilo/(boy*boy))<18.5){
            System.out.println("zayifsiniz");
        }else if((kilo/(boy*boy))>=18.5 && (kilo/(boy*boy))<25){
            System.out.println("kilonuz idealdir.");
        } else if ((kilo/(boy*boy))>=25 && (kilo/(boy*boy))<30) {
            System.out.println("sismansiniz");
        } else if (kilo/(boy*boy)>=30) {
            System.out.println("obez");
        }
    }
}
