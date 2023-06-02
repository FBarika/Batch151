package javaders.day14loopssüleymanhoca;

import java.util.Scanner;

public class Loops01tekrar {
    public static void main(String[] args) {
        //Kullanicidan alinan bir tam sayinin tekrarsiz rakamlarinin toplamini bulunuz.
        //1838 ==> 1+3 =4

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayi yaziniz");
        String s =input.next();
        int sum =0;
        for (int i = 0; i <s.length() ; i++) {
            String k =s.substring(i,i+1);
            if (s.indexOf(k) == s.lastIndexOf(k)) {

                sum = sum + Integer.valueOf(k);
            }
        }
        System.out.println(sum);

        //Bir String deki tekrarli character leri ekrana yazdiran kodu yaziniz.
        //Alabala ==> la

        String a ="Alabala";
        String b="";
        for (int i = 0; i <a.length() ; i++) {
            String x =a.substring(i,i+1);
            if(a.indexOf(x)!=a.lastIndexOf(x) && !b.contains(x)){
                b=b+x;
            }

        }
        System.out.println(b);











    }//main
}//class
