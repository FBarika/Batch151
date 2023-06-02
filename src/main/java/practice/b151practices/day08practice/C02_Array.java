package practice.b151practices.day08practice;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Array {
    public static void main(String[] args) {
        /*
        Hackerlar bazı harfleri sayılara cevirerek yazısabiliyorlar. Genellikle cevirdikleri harfler su sekilde:

        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        ornegin:
         java ile hersey guzel
         j4v4 1l3 h3r53y guz3l

        Kullanıcıdan bir cumle alınız, 'hacker'ların konusma diline cevireniz.

        */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String s=input.nextLine();
        String newArr [] = s.split("");
        System.out.println();
        for (String w:newArr) {
         if(w.contains("s")){
             w="5";
         }
            if(w.contains("a")){
                w="5";
            }
            if(w.contains("e")){
                w="3";
            }
            if(w.contains("i")){
                w="1";
            }
            if(w.contains("o")){
                w="0";
            }
            System.out.print(w);
        }






























    }//main
}//class
