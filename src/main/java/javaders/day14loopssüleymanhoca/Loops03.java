package javaders.day14loopssüleymanhoca;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        //while loop
        int i = 1;
        while(i<1){// while loop ta loop body sinin hic calismamasi mümkündür.(Zero execution is possible)!!!!!!!!!!
            System.out.println("while loop");//while loop ta false cikinca hic yazdirmaz.
            i++;
        }// ekrana hicbir sey yazmaz.


        //******************do-while loop***********************\\
        int k =1;
        do{ // do- while loop body si en az bir kere calisir.
            System.out.println("do-while loop");
           k++;
        }while(k<1);

        // while kontrol eder sonra calistirir ama do-while calistirir sonra kontrol eder.

        //Kullanici bir sayi girsin, sayi 100 den kücük ise kullanici "Kazandiniz" mesaji alsin
        //diger durumlarda "Kaybettiniz"mesaji alsin
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter an integer");
            int n =input.nextInt();
            if(n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }
        }while(true);// true diyince loop sürekli calisacak.for la yapilan hersey while la yapilir while yapilan hemen hemen her sey do while la yapilir. ne den hemen hemen do while önce calisitirp sonra kontrol ettigi icin.


        //Kullanicidan alinan bir cümlenin büyük harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.
        input.nextLine();
        do{
            System.out.println("Please enter a sentence");
            String s=input.nextLine();

            if(s.endsWith(".") && (s.charAt(0)>='A'&& s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct gramatically");
            }else{
                System.out.println("Your sentence has grammatical mistake");
            }
        }while(true);
















    }//main
}//class
