package practice.sorubankasi.variablelar;

import java.util.Scanner;

public class Soru7 {
    /*
    7) İki tamsayıyı değiştirmek için bir kod yazınız.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen iki tane tamsayiyi sirasiyla giriniz");

        int sayi1=input.nextInt();
        int sayi2=input.nextInt();

        System.out.println(sayi1+" "+sayi2);
        int a=10;
        int b=12;
        sayi1=  a;
        sayi2=  b;
        System.out.println(sayi1+" "+sayi2);

    }
}
