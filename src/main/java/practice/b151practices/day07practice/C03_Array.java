package practice.b151practices.day07practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız


        Scanner input =new Scanner(System.in);
        int numbers []=new int[4];

        for (int i = 0; i <4 ; i++) {
            System.out.println("Lütfen bir rakam giriniz");
            int rakam=input.nextInt();
            numbers[i]=rakam;
        }


        System.out.println(Arrays.toString(numbers));
        double sum=0;
        for (int w:numbers) {
            sum+=w;

        }
        double ortalama =sum / numbers.length;
        System.out.println(ortalama);

        for (int w:numbers) {
            if(w>ortalama){
                System.out.println(w+" ");
            }
        }


    }//main
}//class
