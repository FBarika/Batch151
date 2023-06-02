package javaders.day14loopssüleymanhoca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops03tekrar {
    public static void main(String[] args) {

        //Kullanici bir sayi girsin, sayi 100 den kücük ise kullanici "Kazandiniz" mesaji alsin
        //diger durumlarda "Kaybettiniz"mesaji alsin
        Scanner input=new Scanner(System.in);

        do{

            System.out.println("Lütfen bir sayi giriniz.");
            int a =input.nextInt();
            if(a<100){
                System.out.println("Kazandiniz");
            }else if(a>=100){
                System.out.println("Kaybettiniz.");
                break;
            }
        }while(true);

        //Kullanicidan alinan bir cümlenin büyük harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.


        do{
            System.out.println("Lütfen bir cümle giriniz.");
            String s =input.next();
            if(s.endsWith(".") && (s.toUpperCase().charAt(0)>='A'&& s.toUpperCase().charAt(0)<='Z')){
                System.out.println("true");
            }else{
                System.out.println("false");
                break;
            }
        }while(true);







    }//main
}//class
