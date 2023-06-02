package javaders.day15loopsarrayssüleymanhoca;

import java.util.Scanner;

public class NestedLoop01tekrar {
    public static void main(String[] args) {
        /*1.Example:Type code to get the output like
      Week:1
        Day: 1
        Day: 2
        Day: 3
        .....
      Week:2
        Day: 1
        Day: 2
        Day: 3
         ....
      Week:3
        Day: 1
        Day: 2
        Day: 3
         ....

         */

        for (int i = 1; i <5 ; i++) {
            System.out.println("week:"+i);
            for (int j = 1; j <4 ; j++) {
                System.out.println("\tday: "+j);
            }

        }


      /*  2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop / Asagidaki sekli olusturmak icin bir java programi yaziniz.
                        ****
                        ****
                        ****
        Note: Get the number of the rows and the columns from user
       */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char ch =input.next().charAt(0);
        System.out.println("Lütfen satir sayisi giriniz");
        int satir=input.nextInt();
        System.out.println("Lütfen sütun sayisi giriniz");
        int sütun=input.nextInt();

        for (int i = 1; i<=satir ; i++) {
            for (int j = 1; j <= sütun; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

       /* 3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
       */
        System.out.println("Lütfen bir karakter giriniz.");
        char x =input.next().charAt(0);
        System.out.println("Lütfen satir sayisi giriniz");
        int satir1=input.nextInt();

        for (int i =1 ;i<=satir ; i++) {
            for (int j =1;j<=i  ; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }








    }//main
}//class
