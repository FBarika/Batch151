package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02tekrar {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yazdirin, degilse ekrana "Pozitif degil" yazdirin
        */
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        //1 yol
        if(sayi>0){
            System.out.println("pozitif");
        }else{
            System.out.println("negatif");
        }

        //2 yol
        String sonuc = sayi>0? "Pozitif" : "Negatif";
        System.out.println(sonuc);


    }
}
